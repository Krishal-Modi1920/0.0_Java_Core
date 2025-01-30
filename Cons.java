// Constructor in Java
// Multiple Constructors are possible
// For each constructor there should Be a different object (mandatory)
public class Cons {
    String fname;
    int r_no;
    int m1,m2,m3;

    public Cons(String name)
    {
        this.fname = name;
    }

    public Cons(String name, int roll_number)
    {
        this.fname = name;
        this.r_no = roll_number;
    }

    public Cons(String name, int roll_number, int m1, int m2, int m3)
    {
        this.fname = name;
        this.r_no = roll_number;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void display()
    {
        System.out.println("Name : "+ fname);
        System.out.println("Roll Number : " + r_no);
        System.out.println("Marks1 : " + m1);
        System.out.println("Marks2 : " + m2);
        System.out.println("Marks3 : " + m3);
    }

    public static void main(String[] args) {
        Cons obj1 = new Cons("Anaf");
        Cons obj2 = new Cons("Vansh", 12);
        Cons obj3 = new Cons("Monish", 13, 45, 42, 36);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
