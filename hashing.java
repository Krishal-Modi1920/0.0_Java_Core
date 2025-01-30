// convert keywords into indices
// store value using indices
// For same entry we take extra space in hash table

import java.util.HashSet;
import java.util.*;
public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> myhash = new HashSet<>(6, 0.5f);
        HashMap<String, Integer> var = new HashMap<String, Integer>();
        var.put("Abc", 1);
        var.put("Xyz", 2);
        var.put("Pqr", 3);
        var.put("Mno", 4);
        for(String i : var.keySet())
        {
            System.out.println(i + " " + var.get(i));
        }
    }
}
