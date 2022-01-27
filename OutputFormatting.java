import java.util.Scanner;

public class OutputFormatting {
    
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String sl=sc.next();
        int x = sc.nextInt();
        
        
        System.out.printf("%-15s%03d%n", sl, x);
        }
        System.out.println("================================");

    }
}
