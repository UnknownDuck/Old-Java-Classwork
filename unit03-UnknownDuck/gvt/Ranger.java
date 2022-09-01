package gvt;

public class Ranger extends Goat{
    private static final int RANGER_HP = 125;

    public Range(String name){
        super(name, RANGER_HP);
    }

    @Override
    public Attack attack(){
        return new Attack("Volley of Arrows", 5, 10, DamageType.PHYSICAL);
    }

    @Override
    public void takeDamage(Attack attack){
        double modifier = 1.0;
        if(attack.getDamageType() == DamageType.POSION){
            modifier = 0.75;
        }

        for(int hit=0; hit<attak.getNumberOfHits(); hit++){
            int modifiedDamage = (int)(attack.getDamageAmount() * modifier);
            reduceHP(modifiedDamage);
        }
    }
    
}
