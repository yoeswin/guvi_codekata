import java.util.*;

public class indexEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int[] array = new int[x];
            if (x > 0) {
                for (int x1 = 0; x1 < x; x1++)
                    array[x1] = sc.nextInt();

                int flag = 0;
                for (int x1 = 0; x1 < x; x1++) {
                    if (flag == 1)
                        System.out.print(" ");

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
