package logical_program;

import java.util.Scanner;

public class LogicalMain {
    LogicalProgram logicalprogram=new LogicalProgram();
    public static void main(String args[]){
        LogicalProgram logicalprogram = new LogicalProgram();
        System.out.println("1.Fibonacci Series \n2.Reverse Number \n3.Perfect Number \n4.Prime Number \n5.Distance Calculation");
        System.out.println("Enter number to check program : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
            case 1:
                logicalprogram.fibonacciSeries();
                break;
            case 2:
                logicalprogram.reverseNumber();
                break;
            case 3:
                logicalprogram.perfect();
                break;
            case 4:
                logicalprogram.primeNumber();
                break;
            case 5:
                logicalprogram.distance();
                break;
        }
    }

}
