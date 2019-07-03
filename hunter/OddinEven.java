import java.util.Scanner;

public class OddinEven {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < number; i++) {

            if ((i % 2) == 0) {
                if ((array[i] % 2) != 0) {
                    System.out.println(array[i]);
                }
            } else {
                if ((array[i] % 2) == 0) {
                    System.out.println(array[i]);
                }
            }
        }
        sc.close();
    }
}