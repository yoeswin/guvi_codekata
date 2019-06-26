import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int x3 = sc.nextInt();

            if (x1 > x2 && x1 > x3) {
                System.out.println(x1);
            } else if (x2 > x3) {
                System.out.println(x2);
            } else {
                System.out.println(x3);
            }
        } catch (Exception e) {

        }
    }
}
