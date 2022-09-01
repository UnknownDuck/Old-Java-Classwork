package gvt;

public class Attack {
    private final String name;
    private final int numOfHits;
    private final int damageAmount;
    private final DamageType DamageType;

    public Attack(String name,int numOfHits,int damageAmount,DamageType damageType){
        this.name = name;
        this.numOfHits = numOfHits;
        this.damageAmount = damageAmount;
        this.DamageType = damageType;
    }

    public String getName(){
        return this.name;
    }
    public int getNumOfHits(){
        return this.numOfHits;
    }
    public int getDamageAmount(){
        return this.damageAmount;
    }
    public DamageType getDamageType(){
        return this.damageType;
    }
    @Override
    public String toString(){
        return this.name + " hits" + this.numOfHits + " times for " + this.damageAmount + " damage!";
    }
}
