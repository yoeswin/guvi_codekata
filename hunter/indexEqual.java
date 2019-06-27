import java.util.*;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            if (x > 0) {

                for (int x1 = 0; x1 < x; x1++)
                    array[x1] = sc.nextInt();

                int flag = 0;
                for (int x1 = 0; x1 < x; x1++) {
                    if (array[x1] == x1) {
                        System.out.print(array[x1]);
                        flag = 1;
                    }
                }

                if (flag == 0) {
                    System.out.print("-1");
                }

            }

        } catch (Exception e) {

        } finally {
            sc.close();
        }
    }
}
