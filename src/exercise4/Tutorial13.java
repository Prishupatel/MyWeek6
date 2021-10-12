package exercise4;

import java.util.Scanner;

public class Tutorial13 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter the First number:" );
        double num1 =scan.nextDouble();
        System.out.println("Enter the Second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter the Third number: ");
        double num3 = scan.nextDouble();
        double sum;
        double avg;
        scan.close();
        sum = num1+num2+num3;
        avg = sum/3;
        System.out.println("Average of given three number is " +avg);
    }
}
