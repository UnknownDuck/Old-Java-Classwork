import java.util.Scanner;

public class Log {

    public static int log(int b, int n){
        int count = 0;
        while(n > 0){
            n = n / b;
            count++;
            System.out.println(n);
        }
        return count;

    }
    public static void main(String[] args){
        int x = 1;
        while(x == 1){
        Scanner b = new Scanner(System.in);
        System.out.print("enter the base: ");
        int num_b = b.nextInt();

        Scanner n = new Scanner(System.in);
        System.out.print("enter the n: ");
        int num_n = n.nextInt();

        if(num_b < 1){
            x = 0;
        }
        if(num_n < 1){
            x = 0;
        }
        
        log(num_b, num_n);
        n.close();
        b.close();
        }        

       
    }
}
