import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsString {

    public String reverseWords(String s){
        String[] sSplitted = s.trim().split("\\s+");
        List<String> sReverse = new ArrayList<>(Arrays.stream(sSplitted).toList());
        Collections.reverse(sReverse);

        return String.join(" ", sReverse);
    }

    public String reverseWordsStringBuilder(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
