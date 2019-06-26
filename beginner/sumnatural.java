import java.util.*;

public class sumnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            if (x >= 0) {
                int total=0;
                for (int x1 = 0; x1 <= x; x1++) {
                    total +=x1;
                }
                System.out.println(total);
            }
        } catch (Exception e) {

        }
    }
}
