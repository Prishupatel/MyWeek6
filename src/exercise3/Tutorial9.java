package exercise3;


import java.util.Scanner;

public class Tutorial9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String name= scanner.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }

}
