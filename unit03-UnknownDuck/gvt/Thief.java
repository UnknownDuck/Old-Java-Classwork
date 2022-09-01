import java.util.Random;

public class Thief {
    private static final int THIEF_HP = 75;
    private static final Random RNG = new Random();
    
    public Thief(String name){
        super(name, THIEF_HP);
       
    }
    public Attack attack(){ 
        

        return new Attack("Shank", rand.nextInt(1,4),15, damageType.POSION);
    }
    public void takeDamage(Attack attack){
        for(int hit=0; hit<attack.getNumberOfHits(); hit++){
            double dodge = RNG.nextDouble
        }

        for( int hit=0; hit<attack.getNumberOfHits(); hit++){
            int modifiedDamage = (int)(attack.getDamageAmount()* modifier);
            this.currentHp -= modifiedDamage;
            if(this.currentHp <0){
                this.currentHp = 0;
            }
        }
    
}
