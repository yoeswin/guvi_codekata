import java.util.Scanner;

public class OddinEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        StringBuilder OddEven = new StringBuilder();

        for (int i = 0; i < number; i++) {

            if ((i % 2) == 0) {
                if ((array[i] % 2) != 0) {
                    OddEven.append(String.valueOf(array[i]));
                }
            } else {
                if ((array[i] % 2) == 0) {
                    OddEven.append(String.valueOf(array[i]));
                }
            }

            if (!(i == (number - 1))) {
                OddEven.append(" ");
            }

        }
        System.out.println(OddEven);
        sc.close();
    }
}