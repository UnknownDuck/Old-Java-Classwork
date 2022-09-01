public class ExtraStuff {
@Override
public boolean equals (Object o) {
   if (!(o instanceof Pet)) {
      return false;
   }
    
   Pet other = (Pet)(o);    
   return (age == other.age) && 
         name.equals (other.name);
}
