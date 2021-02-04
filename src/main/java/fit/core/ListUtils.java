package fit.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListUtils {
    /* public static <T> List<T> sort(List<T> items, Comparator<T> comp) {
        List<T> sorted = new ArrayList<>(List.copyOf(items));
        sorted.sort(comp);

        return sorted;
    } */

    public static List<String> sort(List<String> items, Comparator<String> comp) {
        List<String> sorted = new ArrayList<>(List.copyOf(items));
        sorted.sort(comp);
        
        return sorted;
    }
}
