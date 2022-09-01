public class Classes {

   
public class Pet {
    private String name;
    private int age;
    public Pet (String name, int age) {
        this.age = age;
        this.name = name;
    }
    public int getAge () {
        return age;
    }
    public void birthday () {
        age++;
    }   
}

//--------------------------------------
public class Pet {
    public String name;
    public int age;
    public String breed;
    public Pet (String name, int age, 
                  String breed) {
      this.age = age;
      this.name = name;
      this.breed = breed;
    }
  }


//OVERLOADED CONSTRUCTOR

public House (String color, int baths, 
              int beds, Boolean hvac) {
    exteriorColor = color;
    numBathrooms = baths;
    numBedrooms = beds;
    this.hvac = hvac;
}
public House (String color) {
    this(color, 2, 3, true);
}
Notice the use of this instead of House when 
calling a constructor from inside a constructor.

    
}
