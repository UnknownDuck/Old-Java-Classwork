public class HelloWorld {

        public static String helloYou(String first, String last){
            String fullName = first + " " + last;
            System.out.println("Hello, " + fullName + "!");
            
            return fullName;
        }
        
        public static void main(String[] args) {
            // System.out.println("Hello World!");
            String name = helloYou("Nichola", "Brink");
            System.out.println(name);
            helloYou("Greg", "Broon");

        }
        
    
    }
    

