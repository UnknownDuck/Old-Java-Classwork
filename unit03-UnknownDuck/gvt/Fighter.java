public class Fighter {
    private static final int FIGHTER_HP = 150;
    private String name;
    private int maxHp;
    private int currentHp;
    
    public Fighter(String name){
        this.name = name;
        this.maxHp = FIGHTER_HP;
        this.currentHp = FIGHTER_HP;
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
    public Attack attack(){ // "Mage missle" 9x4 MAGICAL
        return new Attack("Cleave", 25,1, damageType.PHYSICAL);
    }
    public void takeDamage(Attack attack){
        double modifier = 1.0;
        if(attack.getDamageType() == DamageType.PHYSICAL){
            modifier = 0.75;
        } else if(attack.getDamageType() == DamageType.MAGICAL){
            modifier = 1.25;
        }

        for( int hit=0; hit<attack.getNumberOfHits(); hit++){
            int modifiedDamage = (int)(attack.getDamageAmount()* modifier);
            this.currentHp -= modifiedDamage;
            if(this.currentHp <0){
                this.currentHp = 0;
            }
        }
    }

    public void heal(int amount){
        this.currentHp += amount;
        if(currentHp > this.maxHp){
            this.currentHp = this.maxHp;
        }
    }
}
