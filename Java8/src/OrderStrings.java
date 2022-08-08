import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderStrings {
  public static void main(String[] args) {
    List<String> words = new ArrayList<String>();
    words.add("ccc");
    words.add("a");
    words.add("bb");

    words.sort(Comparator.comparing(String::length));

    words.forEach(System.out::println);
  }
}