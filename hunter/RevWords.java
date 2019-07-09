import java.util.*;

public class RevWords {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        String[] words = sentence.split("\\s+");
        StringBuilder finalWord = new StringBuilder();
        for (String word : words) {
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            finalWord.append(temp.toString()).append(" ");
        }
        System.out.println(finalWord.toString());
        s.close();
    }
    

}