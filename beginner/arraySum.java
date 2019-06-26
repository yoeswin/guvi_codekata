import java.util.*;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] array = new int[x];
            if (x > 0 && y > 0 && x >= y) {
                for (int x1 = 0; x1 < x; x1++)
                    array[x1] = sc.nextInt();

                int total = 0;

                for (int x1 = 0; x1 < y; x1++)
                    total += array[x1];

                System.out.println(total);
            }

        } catch (Exception e) {

        } finally {
            sc.close();
        }
    }
}
