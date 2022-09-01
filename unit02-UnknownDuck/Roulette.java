import java.util.Random;

import java.io.RandomAccessFile;
public class Roulette{
    //I know I would create a random number generator 
    
    public class Bet{
        private int amount;
        private String betName;
        private int location;
    public Beting(int amount,String betName,int location);
        this.amount = amount;
        this.betName = betName;
        this.location = location;
    }
    
    
    
    public static final Random RNG = new Random(){

    public static int random(int min, int max){
        int upperBound = max - min + 1;

        int number = RNG.nextInt(upperBound);
        return number + min;
    }
    };
    public static void main(String[] args){

    }
    
}
