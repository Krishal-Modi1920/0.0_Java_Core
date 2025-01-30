import java.io.*;
public class delete_file {
    public static void main(String[] args) {
        File obj = new File("second.txt");
        if(obj.delete())
        {
            System.out.println("This got deleted");
        }
        else{
            System.out.println("It is already deleted");
        }
    }
}
