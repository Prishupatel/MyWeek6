package exercise2;

import java.util.Scanner;

public class Tutorial6 {
    public static void main(String[] args) {
        double radius=0.0;
        double area =0.0;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();

        area = Math.PI*radius*radius;
        System.out.println("The area of the circle is: "+area);
        sc.close();


    }
}
