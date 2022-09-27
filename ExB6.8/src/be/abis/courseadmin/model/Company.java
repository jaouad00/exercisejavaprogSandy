package be.abis.courseadmin.model;

import be.abis.courseadmin.exception.PriceException;
import be.abis.courseadmin.exception.PriceTooLowException;

public class Company implements Comparable<Company> {

    private int companyNumber;
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public Company(int companyNumber, String name) {
        this(name);
        this.companyNumber = companyNumber;
    }

    public int getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(int companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Company " + companyNumber + " is "+ name+".";
    }

    @Override
    public int compareTo(Company o) {
        return this.name.compareTo(o.name);
    }

    public double requestPriceOfferForCompanySession(Course c, int numberOfParticipants) throws PriceException {
        CompanySession cs = new CompanySession(c,numberOfParticipants);
        double price = cs.calculatePrice();
        if (price < 2000) throw new PriceTooLowException("Abis will not earn enough if price is only " + price+".");
        return price;
    }


}
