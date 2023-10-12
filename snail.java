import java.util.Scanner;

public class snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int snailPosition = 0;
        int days = 1;

        while(snailPosition < h) {
            snailPosition += a;
            if(snailPosition >= h) {
                break;
            }
            snailPosition -= b;
            days++;
        }

        System.out.println(days);
    }
}
