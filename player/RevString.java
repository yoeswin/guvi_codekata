import java.util.*;

public class RevString {
    public static void main(String[] a) {
        try {
            Scanner s = new Scanner(System.in);
            String sentence = s.nextLine();
            StringBuilder finalWord = new StringBuilder(sentence);
            System.out.println(finalWord.reverse().toString());
            s.close();

        } catch (Exception e) {

        }
    }
}