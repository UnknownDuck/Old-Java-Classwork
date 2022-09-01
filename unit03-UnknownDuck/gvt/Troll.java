package gvt;

public abstract class Troll {

private String name;
private final in MAX_HP = 100;
private int hp;
private int regen;

public Troll(String name, int regen){
    this.name = name;
    this.regen = regen;
}
public String getName(){
    return this.name;
}
public int getRegen(){
    return this.regen;
}
public boolean isVanquished(){
    return this.currentHP <= 0;
}

public abstract Attack attack();

public abstract void takedamage();

void reduceHP(int amount){
    this.currentHp -= amount;
    if(this.currentHp <0 ){
        this.currentHp =0;
    }
}
}
