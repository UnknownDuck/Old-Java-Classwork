public class House {
    public int numBathroom;
    public int numBedrooms;
    public boolean hvac;
    public String exteriorColor;

    public House(int numBathrooms, in numBedrooms){
        this.numBathrooms = numBathrooms;
        this.numBedrooms = numBedrooms;

    }
    public House(String exteriorColor){
        //this has to be first and can overlap is exactly the same
        this(4,3,true,exteriorColor);
    }
    public int getNumBathroom(){
        return this.numBathroom;
    }
    //sysout
    public static void main(String[] args) {
        House house = new House(4, 2);
        System.outprintln(house.numBathrooms);
        System.out.println(house.numBedrooms);
        
    }

}
