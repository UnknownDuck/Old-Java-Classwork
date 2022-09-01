package gvt;

public class GoatFightClub {

    public static void fight(Mage mage, Fighter fighter){

        while(mage.isConscious() && fighter.isConscious()){
            Attack attack1 = mage.attack();
            System.out.println(attack1);
            fighter.takeDamage(attack1);

            Attack attack2 = fighter.attack();
            System.out.println(attack2);
            mage.takeDamage(attack2);

            System.out.println(mage);
            System.out.println(fighter);
        }

        if(mage.isConscious() && !fighter.isConscious()){
            System.out.println(mage.getName()+ " win!");
        }else if(!mage.isConscious() && fighter.isConscious()){
            System.out.println(fighter.getName() + " wins!");
        } else{
            System.out.println("It's a tie!");
        }
    }
    public static void main(String[] args){
        Mage mage = new Mage("Hairy Pooter");
        Fighter fighter = new Fighter("Goatnam");
    }
    
}
