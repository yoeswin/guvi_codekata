import java.util.*;

public class numdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int count = 0;
            if (x >= 0) {
                while (x > 0) {
                    x = x / 10;
                    count += 1;
                }
                System.out.print(count);
            }
        } catch (Exception e) {

        } finally {
            sc.close();
        }
    }
}
