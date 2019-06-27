import java.util.*;

public class NonDuplicatenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            if (x >= 0) {
                int[] x1 = new int[x];
                ArrayList<Integer> duplicate = new ArrayList<>();

                for (int temp = 0; temp < x; temp++) {
                    x1[temp] = sc.nextInt();
                }

                for (int temp = 0; temp < x; temp++) {
                    for (int temp1 = temp + 1; temp1 < x; temp1++)
                        if (x1[temp] == x1[temp1]) {
                            if (!duplicate.contains(x1[temp])) {
                                duplicate.add(x1[temp]);
                            }
                        }
                }
                int flag = 0;
                for (int temp = 0; temp < x; temp++) {
                    if(!duplicate.contains(x1[temp])){
                        System.out.print(x1[temp]);
                        flag = 1;
                    }
                }
                if (flag==0) {
                    System.out.println("non unique");
                }
            }
        } catch (Exception e) {

        } finally {
            sc.close();
        }
    }
}
