package exercise1;

public class Tutorial1 {
    int i=20;                           //instance variable 1
    String s = "Chocolates";            // instance variable 2
//This is instance method
    public void test(){
        Tutorial1 t=new Tutorial1();
        Tutorial1 p=new Tutorial1();
        System.out.println(i);

        System.out.println(s);

        System.out.println(t.i);

        System.out.println(p.s);

    }
// This is main method
    public static void main(String[] args) {
        Tutorial1 obj= new Tutorial1();
        System.out.println(obj.i);
        System.out.println(obj.s);

        obj.test();
    }

}
