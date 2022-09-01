import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Miscellany {
    public static String reverseChars(String string){
        String copy = "";
        int length = string.length();
        int i = 0;

        while(i < length){
            char c = string.charAt(i);
            copy = c + copy;
            i = i + 1;
        }
        for(int j = 0; j < length;j = j+i){
            char c =string.charAt(j);
            copy = c + copy;
        }

        return copy;
        
    }
    public static int[] square(int n){
        int[] squares = new int[n];
        for(int i = 0; i < squares.length; i++){
            squares[i] = i * i;

        }
        return squares;
    }
    public static void main(String[] args){
        // String foo = "Buttercup";
        // String reversed = reverseChars(foo);
        // System.out.println(reversed);


        // int[] squares = new int[11];

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        try{
        int n = scanner.nextInt();

        
        System.out.println(Arrays.toString(square(n)));
        } catch(InputMismatchException e) {
        System.err.println("Invalid input");
        System.out.println(e.getMessage());
        }

      

        

    }
}
