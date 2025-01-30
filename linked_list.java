import java.util.*;
public class linked_list {
    public static void main(String[] args) {
        ArrayList<Integer> var = new ArrayList<>();
        var.add(10);
        var.add(12);
        var.add(9);
        var.add(1);
        var.add(19);
        var.add(50);
        var.add(46);
        var.add(17);

        Collections.sort(var);

        for (int i : var)
        {
            System.out.println(i);
        }
    }
}
