package gvt;

public abstract class Goat {
    
    private String name;
    private int maxHp;
    private int currentHp;
    
    public Goat(String name){
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
    }
    public String getName(){
        return this.name;
    }
    public int getMaxHp(){
     return this.maxHp;   
    }
    public int getCurrentHp(){
        return this.currentHp;
    }
    public boolean isConscious(){
        return (this.currentHp > 0);
    }
    public abstract Attack attack(); // "Mage missle" 9x4 MAGICAL
       
    
    public abstract takeDamage(Attack attack);

        
        //double modifier = 1.0;
        //if(attack.getDamageType() == DamageType.MAGICAL){
        //    modifier = 0.75;
        //} else if(attack.getDamageType() == DamageType.PHYSICAL){
        //    modifier = 1.25;
        //}
        //
        //for( int hit=0; hit<attack.getNumberOfHits(); hit++){
        //    int modifiedDamage = (int)(attack.getDamageAmount()* modifier);
        //    this.currentHp -= modifiedDamage;
        //    if(this.currentHp <0){
        //        this.currentHp = 0;
        //    }
        //}
        //this.currentHp -= attack.damageAmount;
    

    public void heal(int amount){
        this.currentHp += amount;
        if(currentHp > this.maxHp){
            this.currentHp = this.maxHp;
        }
    
    }
    void reduceHP(int amount){
        this.currentHp -= amount;
            if(this.currentHp < 0){
                this.currentHp = 0;
            }
    }
}
