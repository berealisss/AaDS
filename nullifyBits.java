import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n = scanner.nextInt();

        int mask = (1 << n) - 1;
        int result = a & mask;

        System.out.println(result);
    }
}
