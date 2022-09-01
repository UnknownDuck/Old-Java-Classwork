package activities;

import java.lang.WeakPairMap.Pair.Weak;

public class Ship {
    private String name;
    private int hullRating;
    private int shields;
    private int maxShields;
    private Weapon weapon;

    public Ship( String name, int hullRating, int maxShields, int shields, Weapon weapon){
        this.name = name;
        this.hullRating = hullRating;
        this.shields = shields;
        this.maxShields = maxShields;
        this.weapon = weapon;
    }
    public Ship(String name, int hullRating){
        this(name, hullRating, new Weapon("Ion Cannon", 100,"Ion","Blue"),0);

    }
    public String getName(){
        return this.name;
    }
    public int HullRating(){
        return this.hullRating;
    }
    @Override
    public string toString(){
        return this.name + ": Shields  " + this.shields + " hull " + this.hullRating; 
    }
    @Override
    public boolean equals( Object o){
        if (!(o instanceof Weapon)){
            Weapon other =(Weapon)(o);
            return this.damageAmount == other.damageAmount && this.damageType.equals(other.damageType);
        }else{
            return false;
        }
    }
    

    public static void main(String[] args){
        
        Ship ship = new Ship();
    }
    
}
