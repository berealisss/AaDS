import java.util.Scanner;

public class circualarShift {
    public static int leftCyclicShift(int num, int n) {
        String numStr = Integer.toString(num);
        String shiftedStr = numStr.substring(n) + numStr.substring(0, n);
        return Integer.parseInt(shiftedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int n = scanner.nextInt();

        int shiftedNum = leftCyclicShift(num, n);
        System.out.println(shiftedNum);
    }
}
