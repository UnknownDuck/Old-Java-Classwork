package pokemon;
/**
 * 
 * @author Nicholas Brink 
 * 
 */
public class Pokemon {
    
    private Sting name;
    private final PokemonTypes type;
    private int level;
    private final int maxLevel = 100;
    
    public Pokemon(String name, PokemonTypes type, int level){
        this.name = name;
        this.type = type;
        this.level = level;
        //constructer like python 
    
    }
    public Pokemon(String name, String type){
        this(name,type,1);
        //This is an overrider that will use this() and set the default to whatever 
        // the inputed value is
    }
    public void setName(String newName){
        this.name = newName;
        //this allows for the changing of a name at anytime 
        // this is a mutator
    }
    public String getName(){
        return this.name;
        //allows access to the private
        //this is a accessor*
    }
    public String getType(){
        return this.type;
        //this allows you to see it but not change it 
        // ie accessor
    }
    public int getLevel(){
        return this.level;
    }
    public String toString(){
        return "Pokemon: Name = " + this.name + ", Type = " + this.type + ", Level = " + this.level;
        // this is legit used to just print the thing nerd
    }
    public void levelup(){
        if(level != maxLevel){
            level = maxLevel;
        } else{level += 1;}  
        //this  checks if they are the max lv if they are not they do not lv up     
    }
    @Override
    public boolean equals(Object o){
            if (!(o instanceof Pokemon)){
                Pokemon other = (Pokemon)(o);
                return (this.type == other.type && this.level == other.level);
                //very specific syntaxt that compares the 2 objects
            }else{
                return false;
                //needs a return false incase comparing to different things
            }
            
    }
}
