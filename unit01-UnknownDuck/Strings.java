public class Strings {
    
    public static void main(String[] args) {
        String aString = "Jason";

        int length = aString.length();

        char first = aString.charAt(0);
        char last = aString.charAt(4);

        char ending = aString.charAt(length - 1);
        System.out.println(ending);
        System.out.println(first);
        System.out.println(last);
    }
}
