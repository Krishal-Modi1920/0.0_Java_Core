import java.io.*;
public class write_file {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("first.txt");
            obj.write("Hello World");
            obj.write("\nI am cool");
            System.out.println("Written Successfully in file.");
            obj.close();
        }
        catch(IOException e){
            System.out.println("An error Occured");
            e.printStackTrace();
        }
    }
}
