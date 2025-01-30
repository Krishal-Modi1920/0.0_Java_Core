interface Operations{
    public int add(int a, int b);
    public int sub(int a, int b);
    public int mul(int a, int b);
    public int div(int a, int b);
    public int mod(int a, int b);
}

class operator implements Operations{

    public int add(int a, int b)
    {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    @Override
    public int mod(int a, int b) {
        return a % b;
    }
}


public class inteface {
    public static void main(String[] args) {
        operator obj = new operator();
        System.out.println(obj.add(2,3));
        System.out.println(obj.sub(6,3));
        System.out.println(obj.mul(2,3));
        System.out.println(obj.div(20,10));
        System.out.println(obj.mod(20,3));

    }
}
