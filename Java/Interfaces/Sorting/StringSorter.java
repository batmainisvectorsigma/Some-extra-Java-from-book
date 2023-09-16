import java.util.Arrays;
import java.util.Comparator;

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}

public class StringSorter {
    public static void main(String[] args) {
        String[] friends = {"Peter", "Paul", "Mary"};
        System.out.println("Before Sorting:");
        for (String friend : friends) {
            System.out.println(friend);
        }

        Arrays.sort(friends, new LengthComparator());

        System.out.println("\nAfter Sorting by length:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
/*
 Output
 Before Sorting:
Peter
Paul
Mary

After Sorting by length:
Paul
Mary
Peter
 */
