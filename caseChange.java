import java.util.Scanner;

public class caseChange {
    public static char changeCase(char c) {
        if (Character.isLowerCase(c)) {
            return Character.toUpperCase(c);
        } else {
            return Character.toLowerCase(c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        char newC = changeCase(c);

        System.out.println(newC);
    }
}
