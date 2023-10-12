import java.util.Scanner;

public class MKAD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roadLength = 109, startingPoint = 0;

        int v = scanner.nextInt();
        int t = scanner.nextInt();

        int markNumber = (v * t) % roadLength;

        if(markNumber < startingPoint) {
            markNumber += roadLength;
        }

        System.out.println(markNumber);
    }
}
