import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Files {

    public static String info(String file){
        File file = new;
        File("some_file.txt");

    }

    public static void main(String[] args) throws IOException{
        File file = new File(" .gitignore");

        String name = file.getName();
        String absolutePath = file.getAbsolutePath();
        long size = file.length();
        boolean exists = file.exists();
        File parent = file.getParentFile();

        FileReader fileReader = 
            new FileReader("a_file.txt");
        BufferedReader reader =
            new BufferedReader(fileReader);
        String line = reader.readLine();
        reader.close();
        fileReader.close();
    }
    while(line != null){
        
    }
    
}
