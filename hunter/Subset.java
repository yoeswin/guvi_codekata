import java.util.*;

public class Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        Set<Integer> array1 = new TreeSet<>();
        Set<Integer> array2 = new TreeSet<>();

        for (int i = 0; i < number1; i++) {
            array1.add(sc.nextInt());
        }

        for (int i = 0; i < number2; i++) {
            array2.add(sc.nextInt());
        }

        if (number1 >= number2) {
            if (array1.containsAll(array2))
                System.out.print("YES");
            else
                System.out.print("NO");

        }
        sc.close();
    }
}