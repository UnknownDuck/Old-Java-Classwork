
package gvt;

public class Trolling extends Troll {
    private static final String NAME = "Trolling";
    private static final int HP = 36;
    private static final double REGEN = 0.03;

    public Trolling(){
        super(NAME,HP,REGEN);
    }

    @Override
    public Attack attack(){
        return new Attack("U Mad?",4,5,DamageType.PYSICAL);
    }
    @Override
    public void takeDamage(Attack attack){
        //more stuff
    }

    
}
