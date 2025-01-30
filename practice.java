import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number to check Even or Odd : ");
        int no = sc.nextInt();
        if (no % 2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}