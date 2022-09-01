public class IterativeFib {

    public static int fib(int x){
        int n1 = 0;
        int n2 = 1;
        int new1 = 0;
        for(int count = 0;count <=x;){
            System.out.println(n1);
            System.out.println(n2);
            
            new1 = n1 + n2;
            n2 = n1;
            n1 = new1;
            

        }
        return new1;

    }
    public static void main(String[] args){
        fib(10); 

    }
    
}
