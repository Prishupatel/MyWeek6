package exercise1;

public class Tutorial3 {
    int x=01;            //instance variable
    int k=9;             //instance variable
    static int y=02;     //static variable
    static String z="WWW.AMAZON.COM";  //static variable

// This is instance method
    public void test(){
        System.out.println(x);       //instance variable to instance method
        System.out.println(k);

        int a;                       //Local variable
        a= Tutorial3.y;              //assign value
        System.out.println(a);       // static variable to instance

        System.out.println(Tutorial3.y); //Static variable to Instance method calling by class name "Tutorial3"
        System.out.println(Tutorial3.z);    // ''   ''     ''   ''      ''     ''     ''   ''   ''     ''

    }
// This is static method
    public static void myNum(){
        Tutorial3 obj1= new Tutorial3();  //  Creating object
        System.out.println(obj1.x);    //Instance variable to static method by creating object
        System.out.println(obj1.k);    //  ''      ''       ''    ''    '''       '''     '''
        System.out.println(y);       // Static variable to static method
        System.out.println(z);

    }
 //This is main method
 public static void main(String[] args) {

        myNum();                        //static method to static method
        Tutorial3 obj2=new Tutorial3();  // Creating object
        obj2.test();                    // Instance method to static method


 }
}
