import java.util.Scanner;

public class Scanners {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        int months = age * 12;
        System.out.println("Age in months: " + months);
        scanner.close();



    }
    
}
