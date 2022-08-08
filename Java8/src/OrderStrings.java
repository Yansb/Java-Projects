import java.util.ArrayList;
import java.util.List;

public class OrderStrings {
  public static void main(String[] args) {
    List<String> words = new ArrayList<String>();
    words.add("ccc");
    words.add("a");
    words.add("bb");

    words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

    words.forEach(d -> System.out.println(d));

    new Thread(() -> System.out.println("executando um runnable")).start();
  }
}