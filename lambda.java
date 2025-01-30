import java.util.ArrayList;
import java.util.function.Consumer;

public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> var = new ArrayList<>();
        var.add(5);
        var.add(9);
        var.add(10);
        var.add(11);
        Consumer<Integer> method = (n) -> {System.out.println(n);};
        var.forEach(method);
    }
}
