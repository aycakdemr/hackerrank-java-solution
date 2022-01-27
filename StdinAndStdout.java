import java.util.Scanner;

public class StdinAndStdout {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
