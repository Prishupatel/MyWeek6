package exercise4;

import java.util.Scanner;

public class
Tutorial16 {
    public static String add(String num1, String num2){
        int num1Binary =Integer.parseInt(num1,2);
        int num2Binary =Integer.parseInt(num2,2);
        int sumOfNumbers = num1Binary + num2Binary;
        return Integer.toBinaryString(sumOfNumbers);


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first binary number :");
        String number1 = scanner.next();

        System.out.println("Enter second binary number :");
        String number2 = scanner.next();

        System.out.println("Sum of numbers :" +add(number1,number2));
    }
}
