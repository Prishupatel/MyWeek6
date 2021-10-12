package exercise2;

import java.util.Scanner;


public class Tutorial7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit: ");
        double fahrenheit =input.nextDouble();

        double celsius= ((fahrenheit-32)*5/9);
        System.out.println(fahrenheit + "degree Fahrenheit is equal to " +celsius + "in Celsius");


    }
}
