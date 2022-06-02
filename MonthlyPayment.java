package logical_program;

public class MonthlyPayment {
    public static void main(String args[]) {
        System.out.println("Enter principle loan amount: ");
        double principleLoan = Double.parseDouble(args[0]);
        System.out.println("Enter year : ");
        double year = Double.parseDouble(args[1]);
        System.out.println("Enter annual interest rate");
        double interest = Double.parseDouble(args[2]);
       
        double monthlyRate = interest / (12 * 100);

        double monthlyPayment = principleLoan * monthlyRate / (1 - Math.pow(1 + monthlyRate, year * 12));

        System.out.println("Monthly monthlyPayment : " + monthlyPayment);
        System.out.println("Total Payment : " + (monthlyPayment * 12) * year);

    }
}
