import java.io.File;
import java.io.IOException;
public class file_intro {

    public static void main(String[] args) {

        try{
            File obj = new File("first.txt");
            if(obj.createNewFile()){
                System.out.println("File Creates with name : " + obj.getName());
            }
            else{
                System.out.println("File already exist");
            }
        }

        catch(IOException e){
            System.out.println("An Error occured");
            e.printStackTrace();
        }
    }
}
