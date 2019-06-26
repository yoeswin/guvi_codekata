import java.util.*;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            char ch = sc.next().charAt(0);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                        || ch == 'u' || ch == 'U') {
                    System.out.print("Vowel");
                } else {
                    System.out.print("Consonant");
                }
            } else {
                System.out.print("invalid");
            }
        } catch (Exception e) {
        }
        finally{
            sc.close();
        }
    }
}
