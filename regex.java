import java.util.regex.*;
public class regex {
        public static void main(String[] args) {
            Pattern pattern = Pattern.compile("the");
            Matcher match = pattern.matcher("Visiting the W3Schools using Chrome Browser");
            boolean matchFound = match.find();
            if(matchFound)
            {
                System.out.println("Yes ");
            }
            else{
                System.out.println("No");
            }
        }
    }
