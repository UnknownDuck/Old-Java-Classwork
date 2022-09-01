public class Political {

    public enum Position{
        MAYOR,
        SHERIFF,
        JUDGE,
        ASSEMBLY,  
    }
    public class Canidate{
        private String name;
        private String position;
        private String politicalParty;

    public partyManage( String name, String position, String politicalParty){
        this.name = name;
        this.position = position;
        this.politicalParty = politicalParty;
    }
    @Override
    public boolean equals(Object o){
            if (!(o instanceof partyManage)){
                return false;
            }
            partyManage other = (partyManage)(o);
            return (name == other.name && position == other.position) && name.equals(other.name);


        }
    
    public String toString(){
        return "Candidates" + this.name + "is running for" + this.position + "and is the part of the " + this.politicalParty;
         }
    }
    
}

