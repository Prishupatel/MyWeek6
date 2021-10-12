package exercise1;

public class Tutorial2 {
    static int z=25;               //static variable
    static String brand ="Tesla";  //static variable
    static String model ="S";      //static variable

    //This is static method
    public static void myCar(){
        System.out.println(z);
        System.out.println(brand);
        System.out.println(model);
    }

    public static void main(String[] args) {
        myCar();
        System.out.println(Tutorial2.model);
        System.out.println(Tutorial2.brand);
        System.out.println(Tutorial2.z);
    }
}
