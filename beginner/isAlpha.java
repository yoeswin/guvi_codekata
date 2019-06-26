import java.util.*;

public class isAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            char ch = sc.next().charAt(0);
            if (Character.isLetter(ch)) {
                System.out.print("Alphabet");
            } else {
                System.out.print("No");
            }
        } catch (Exception e) {

        }
        finally{
            sc.close();
        }
    }
}
