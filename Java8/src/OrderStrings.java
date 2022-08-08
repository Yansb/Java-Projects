import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class OrderStrings {
  public static void main(String[] args) {
    List<String> words = new ArrayList<String>();
    words.add("ccc");
    words.add("a");
    words.add("bb");

    Comparator<String> compare = new CompareBySize();
    System.out.println(words);

    // Collections.sort(words, compare);
    words.sort(compare);

    System.out.println(words);

    // for(String w : words){
    //   System.out.println(w);
    // }

    Consumer<String> consumer = new PrintInLine();
    words.forEach(consumer);

  }
}

class CompareBySize implements Comparator<String> {

  @Override
  public int compare(String s1, String s2) {
    if(s1.length() < s2.length()){
      return -1;
    }

    if(s1.length() > s2.length()){
      return 1;
    }

    return 0;
  }
}

class PrintInLine implements Consumer<String> {

  @Override
  public void accept(String s) {
    System.out.println(s);
  }
}