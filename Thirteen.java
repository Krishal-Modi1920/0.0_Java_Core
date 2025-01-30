// Static and Public Methods
public class Thirteen {
    static void mymethod()
    {
        System.out.println("Steven Started a Apple:");
    }

    public static int add(int a, int b)
    {
        return a + b;
    }


    public static void main(String[] args) {
        mymethod();
        Thirteen obj = new Thirteen();

        System.out.println(obj.add(2,3));

    }
}