package activities;

public class Weapon {
    private String name;
    private String damageType;
    private String color;
    private int damageAmount;

    public Weapon(String name, int damageAmount){
        this.name = name;
        this.damageAmount = damageAmount;
    }
    public int getDamageAmount(){
        return this.damageAmount;
    }
    public String getColor(){
        return this.color;
    }
    
    
    
    public static void main(String[] args){
        Weapon weapon = new Weapon("Lazer",100,"Normal","Red");
        System.out.println(weapon.damageAmount);

    }

    

    
}
