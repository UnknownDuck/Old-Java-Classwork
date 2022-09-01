import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculon {
    public static double add(double x, double y) {
        System.out.println("" + x + " + "+ y + " = "+ (x+y));
        return x + y;


    }
    public static double subtract(double x, double y) {
        System.out.println("" + x + " - "+ y + " = "+ (x-y));
        return x - y;


    }
    public static double multiply(double x, double y) {
        System.out.println("" + x + " * "+ y + " = "+ (x*y));
        return x * y;


    }
    public static double divide(double x, double y) {
        System.out.println("" + x + " / "+ y + " = "+ (x/y));
        return x / y;


    }
    public static double power(double base, int exponent){
        double result = 1;
        for(int i=1; i<exponent; i++){
            result = result * base;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(5,10));
        try{
        Scanner s = new Scanner(System.in);
        System.out.print("enter two numbers: ");
        
        double x = s.nextDouble();
        double y = s.nextDouble();

        System.out.println(add(x,y));
        System.out.println(subtract(x,y));
        System.out.println(divide(x,y));
        System.out.println(multiply(x,y));
        s.close();
        } catch(InputMismatchException e){
            System.err.println("Invalid input");

        }


        
    }
}
