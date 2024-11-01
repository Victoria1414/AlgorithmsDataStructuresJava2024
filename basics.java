import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static <T extends Comparable<? super T>> T findMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        
        T max = list.get(0);
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Collections.addAll(intList, 1, 5, 3, 8, 2);
        
        Integer maxInt = findMax(intList);
        System.out.println("Maximum Integer: " + maxInt);

        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "apple", "orange", "banana", "pear");
        
        String maxString = findMax(stringList);
        System.out.println("Maximum String: " + maxString);
    }
}
