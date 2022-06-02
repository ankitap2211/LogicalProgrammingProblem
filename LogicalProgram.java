package logical_program;

import java.util.Scanner;

public class LogicalProgram {
    void perfect() {
        System.out.println("Enter number to check perfect or not :");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int sum = 0, i;
        for (i = 1; i < number; i++)
            if (number % i == 0) {
                sum = sum + i;
            }
        if (sum == number)
            System.out.println(number + " is perfect number");
        else
            System.out.println(number + " is not perfect");
    }
}


