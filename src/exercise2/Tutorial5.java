package exercise2;
public class Tutorial5 {
    static double x=25;
    double y=10;

    public void addition(){
       double sum=(Tutorial5.x+y);
        System.out.println("Addition of 25 and 10 is " +sum);

    }

    public void subtraction(){
        double sub=(Tutorial5.x-y);
        System.out.println("Subtraction of 25 and 10 is " +sub);
    }

    public static void multiplication(){
        Tutorial5 objmul= new Tutorial5();
        double mul=(x*objmul.y);
        System.out.println("Multiply of 25 and 10 is " +mul);
    }

    public static void division(){
        Tutorial5 objdiv= new Tutorial5();
        double div=(x/ objdiv.y);
        System.out.println("Division of 25 and 10 is " +div);
    }

    public static void main(String[] args) {
        System.out.println("<----------CALCULATION---------->" );
        Tutorial5 obj1=new Tutorial5();
        obj1.addition();
        obj1.subtraction();
        multiplication();
        division();




    }

}
