import java.util.Scanner;
public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0;i <=2 ; i++)
        {
            for(int j = 0;j<=2; j++)
            {
                System.out.println("Enter a[" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i <=2 ; i++)
        {
            for(int j = 0;j<=2; j++)
            {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
