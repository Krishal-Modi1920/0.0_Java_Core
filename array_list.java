import java.util.*;
public class array_list{
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("************************* Welcome to Store *************************");

        int input = -1;

        while (input != 0){

            System.out.println("Select the Option to Add the Item to Your Cart" +
                    "1. Pizza" +
                    "2. Burger" +
                    "3. HotDog" +
                    "4. Donut" +
                    "5. Pastry" +
                    "6. Mexican" +
                    "7. Italian" +
                    "0. To exit Shopping");
            System.out.println("Enter The Input");
            input = sc.nextInt();

            if(input == 1)
            {
                cart.add("Pizza");
            }
            else if(input == 2)
            {
                cart.add("Burger");
            }
            else if(input == 3)
            {
                cart.add("Hotdog");
            }
            else if(input == 4)
            {
                cart.add("Donut");
            }
            else if(input == 5)
            {
                cart.add("Pastry");
            }
            else if(input == 6)
            {
                cart.add("Mexican");
            }
            else if(input == 7)
            {
                cart.add("Italian");
            }
            else {
            System.out.println("There is no such input!!");
            }

        }
        System.out.println("Your cart consist of : " + cart);
        System.out.println("Your Bucket Size is : " + cart.size());
    }
}