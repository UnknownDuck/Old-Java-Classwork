public class FileReading {
    

    FileReader fileReader = new FileReader("a_file.txt");
    BufferedReader reader = new BufferedReader(fileReader);
    String line = reader.readLine();
    reader.close();
    fileReader.close();

}


    FileWriter fw = new FileWriter("a_file.txt");
2  PrintWriter writer = new PrintWriter(fw);
3  writer.print("Your age is: ");
4  writer.print(18);
5  writer.println(" years old.");
6  writer.flush();
7  writer.close();

