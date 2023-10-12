import java.util.Scanner;

public class modifiedEuclidean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int steps = 0;

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
            steps++;
        }

        System.out.println(a + " " + steps);
    }
}
