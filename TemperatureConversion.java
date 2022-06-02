package logical_program;

import java.util.Scanner;

class TemperatureConversion {
    static void temperatureConversion() {
        double fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type conversion \n1.Fahrenheit to Celsius\n2.Celsius to Fahrenheit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Fahrenheit temperature");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Celsius temperature is " + celsius);
                break;
            case 2:
                System.out.println("Enter Celsius temperature");
                celsius = sc.nextDouble();
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Fahrenheit temperature is " + fahrenheit);
                break;
            default:
                System.out.println("please enter valid input");
        }
    }

    public static void main(String args[]){
        TemperatureConversion temp=new TemperatureConversion();
        temp.temperatureConversion();
    }
}