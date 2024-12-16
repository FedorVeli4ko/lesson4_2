import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedStrings {

    private List<String> strings;

    public SortedStrings() {
        strings = new ArrayList<>();
    }

    public void add(String string) {
        strings.add(string);
        Collections.sort(strings, Comparator.comparingInt(String::length));
    }

    public String getMax() {
        if (strings.isEmpty()) {
            return null;
        }
        return strings.get(strings.size() - 1);
    }

    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0;
        }
        double totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        return totalLength / strings.size();
    }

    public static void main(String[] args) {
        SortedStrings sortedStrings = new SortedStrings();

        sortedStrings.add("a");
        sortedStrings.add("abc");
        sortedStrings.add("bcde");
        sortedStrings.add("fghijk");
        sortedStrings.add("lmnopqrst");

        System.out.println("Массив строк: " + sortedStrings.strings);
        System.out.println("Строка максимальной длины: " + sortedStrings.getMax());
        System.out.println("Средняя длина строк: " + sortedStrings.getAverageLength());


        SortedStrings emptySortedStrings = new SortedStrings();
        System.out.println("Средняя длина строк в пустом массиве: " + emptySortedStrings.getAverageLength());
        System.out.println("Максимальная строка в пустом массиве: " + emptySortedStrings.getMax());
    }
}
