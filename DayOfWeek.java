package logical_program;

import java.util.Scanner;

public class DayOfWeek {
    public int dayOfWeek(int d, int y, int m) {
        int  m0, x, m1 = 0, d1 = 0;
        int y0 = y - (14 - m1) / 12;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = m + 12 * ((14 - m1) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date, d0 = 0;
        int month, year;
        System.out.println("Enter Day :");
        date = sc.nextInt();
        System.out.println("Enter Month :");
        month = sc.nextInt();
        System.out.println("Enter Year :");
        year = sc.nextInt();

        DayOfWeek dayofweek = new DayOfWeek();
        d0 = dayofweek.dayOfWeek(date, month, year);

        switch (d0) {
            case 0:
                System.out.println("Sunday");
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
        }
    }
}

