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

    void fibonacciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range to get the Fibonacci series: ");
        int range = sc.nextInt();
        int f1 = 0, f2 = 1;
        for (int i = 1; i <= range; ++i) {
            System.out.print(f1 + " ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }

    void primeNumber() {
        int number, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println("is prime number");
        else
            System.out.println("is not prime number");
    }

    void reverseNumber() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reminder, sum = 0;
        while (number > 0) {
            reminder = number % 10;
            sum = sum * 10 + reminder;
            number = number / 10;
        }
        System.out.println("The reverse number if given number is:" + sum);
    }
}


