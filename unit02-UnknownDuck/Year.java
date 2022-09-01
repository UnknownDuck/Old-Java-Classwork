/**
 * 
 * @author Nicholas Brink 
 */
public class Year {
    
    public static int YEAR_LENGTH =365;
    private int yearNumber;
    private int numberOfDays;

    public Year(int yearNumber){
        this.yearNumber = yearNumber;
    }
    public int numberOfDays(){
        return daysInYear(this.yearNumber);
    }
    public int getyearNumber(){
        return this.yearNumber;
    }
    


    public static int daysInYear(int yearNum){
        /**
         * 
         * 
         * 
         */
        int days = YEAR_LENGTH;
        if(yearNum % 400 == 0 || (yearNum % 4 == 0 && yearNum % 100 != 0)){
            return days += 1;
        }
        
        return 0;
       

    
    }
    public static void main(String[] args){
        System.out.println("Dys in 2000: " + daysInYear(2000));
        System.out.println("Dys in 2022: " + daysInYear(2022));
        System.out.println("Dys in 2100: " + daysInYear(2100));

    }
}
