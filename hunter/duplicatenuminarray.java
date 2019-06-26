import java.util.*;

public class duplicatenuminarray {
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

                int flag = 1;
                for (int temp = 0; temp < x; temp++) {
                    for (int temp1 = temp + 1; temp1 < x; temp1++)
                        if (x1[temp] == x1[temp1]) {
                            if (!duplicate.contains(x1[temp])){
                                System.out.println(x1[temp]);
                                duplicate.add(x1[temp]);
                                flag = 0;
                            }
                        }
                }
                if(flag==1){
                    System.out.println("unique");
                }
            }
        } catch (Exception e) {

        } finally {
            sc.close();
        }
    }
}
