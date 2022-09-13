public class ExB18 {

    public static void main(String[] args) {
        String firstName="Sandy";
        int startAge=Integer.parseInt(args[0]);
        int age=Integer.parseInt(args[1]);
        double monthlyGrossStartSalary=Double.parseDouble(args[2]);
        boolean senior=true;

        int loopAge=startAge;
        double salary=monthlyGrossStartSalary;
        double netSalary=0;

        while (loopAge<=age && loopAge<=startAge+35){

            if (loopAge!=startAge){ salary=salary*1.05;}
            double grossSalary=salary*12;
            //System.out.println("monthly gross salary is " + salary);
            //System.out.println("yearly gross salary is " + grossSalary);

            double taxRate=0;
            if (grossSalary<13870){
                taxRate=25;
            } else if (grossSalary>=13870 && grossSalary<24480){
                taxRate=40;
            } else if (grossSalary>=24480 && grossSalary<42370){
                taxRate=45;
            } else {
                taxRate=50;
            }
            //System.out.println("taxRate is " + taxRate);

             netSalary = salary*(1-taxRate/100.);

            System.out.println(firstName + "'s net salary at " + loopAge + " is " + netSalary );
            loopAge+=2;

            //System.out.println();
        }

        double monthlyGrossSalary=salary;
        System.out.println("\n"+firstName + " is " + age + " years old. Monthly gross salary is " + monthlyGrossSalary + ".");
        System.out.println(firstName + " is" + ((!senior)?" not":"")  + " a senior.");
        System.out.println("The instructor's net salary is " + netSalary);

        String[] domains = {"Java","Oracle","XML","SAS"};
        System.out.println("There are " + domains.length + " domains linked with the instructor:");
        for (String domain:domains){
            System.out.println(domain);
        }


    }
}
