package exercise1;

public class Tutorial4 {
    int continents=7;                                  //instance variable
    static String s="Total continents in the world" ; // static variable

    public void instance(){                        //instance method
        System.out.println(continents);           // Direct calling
        System.out.println(Tutorial4.s);         // static to instance by calling classname.

    }

    public static void myTwo(){                //This is static method
        System.out.println(s);                 // static to static method

        Tutorial4 obj1=new Tutorial4();        //creating object for
        System.out.println(obj1.continents);    // calling instance variable to static method
    }

    public static void main(String[] args) {
        myTwo();
        Tutorial4 obj2=new Tutorial4();     // creating object for
        obj2.instance();                    // calling instance method into static method



    }




}
