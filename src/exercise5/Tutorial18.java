package exercise5;

import java.util.Scanner;

public class Tutorial18 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("input first number");
        int num1= sc.nextInt();

        System.out.println("input second number");
        int num2=sc.nextInt();

        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));

        System.out.println(num1 + "-" + num2 + "=" + (num1-num2));

        System.out.println(num1 + "*" + num2 + "=" + (num1*num2));

        System.out.println(num1 + "/" + num2 + "=" + (num1/num2));

        System.out.println(num1 + "mod" + num2 + "=" + (num1%num2));



    }
}
