package gvt;

public class Mage {
    private static final int MAGE_HP = 100;
   
    
    public Mage(String name){
        super(name, MAGE_HP);
    }
    public Attack attack(){ // "Mage missle" 9x4 MAGICAL
        return new Attack("Magic Missle", 9,4, damageType.MAGICAL);
    }
    public void takeDamage(Attack attack){
        double modifier = 1.0;
        if(attack.getDamageType() == DamageType.MAGICAL){
            modifier = 0.75;
        } else if(attack.getDamageType() == DamageType.PHYSICAL){
            modifier = 1.25;
        }

        for( int hit=0; hit<attack.getNumberOfHits(); hit++){
            int modifiedDamage = (int)(attack.getDamageAmount()* modifier);
            this.currentHp -= modifiedDamage;
            if(this.currentHp <0){
                this.currentHp = 0;
            }
        }
        //this.currentHp -= attack.damageAmount;
    }

    public void heal(int amount){
        this.currentHp += amount;
        if(currentHp > this.maxHp){
            this.currentHp = this.maxHp;
        }
    }
}
