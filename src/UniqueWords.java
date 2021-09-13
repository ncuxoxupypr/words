import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("SetOperations.txt", "\\W+"));
        System.out.println(words);
    }
}
