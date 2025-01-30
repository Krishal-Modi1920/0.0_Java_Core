abstract class animal {
    public abstract void sleep();

    public int add(int a, int b) {
        return a + b;
    }
}

class Sound extends animal {
    public void sleep() {
        System.out.println("zzzz");
    }
}

public class obs {
    public static void main(String[] args) {
        Sound obj = new Sound();

        System.out.println(obj.add(4, 5));  // Output: 9

        obj.sleep();
    }
}
