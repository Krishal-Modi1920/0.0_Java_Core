import java.util.Scanner;
public class twelve {
    public static int fibo(int number)
    {

        if (number == 0)
        {
            return number;
        }
        else
        {
            return number + fibo(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter The Number : ");
        number = sc.nextInt();
        System.out.println(fibo(number));
    }
}











/*
import java.util.Scanner;
public class twelve {
    public static int fact(int number)
    {
        if(number == 0)
        {
            return 1;
        }
        else
        {
            return number * fact(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter The Number : ");
        number = sc.nextInt();
        System.out.println(fact(number));
    }
}

*/