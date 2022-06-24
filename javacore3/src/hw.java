import java.util.*;

public class hw {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(new Integer[]{1, 4, 6, 9, 11, 2, 7, 3, 8}));
        set.addAll(Arrays.asList(new Integer[]{1, 3, 2, 4, 5, 10, 11, 6}));

        TreeSet sorted = new TreeSet<>(set);
        System.out.println(sorted);

    }
}
