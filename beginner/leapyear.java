import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            if (x >= 0) {
                if (x % 400 == 0) {
                    System.out.println("yes");
                } else if ((x % 100 == 0)) {
                    System.out.println("no");
                } else if (x % 4 == 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        } catch (Exception e) {

        }
    }
}
