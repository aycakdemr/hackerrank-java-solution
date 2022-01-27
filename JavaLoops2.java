
import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("t değeri");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("a değeri");
            int a = in.nextInt();
            System.out.println("b değeri");
            int b = in.nextInt();
            System.out.println("n değeri");
            int n = in.nextInt();
            int s = a;
            for(int j=0;j<n ; j++){
                
                s = (int) (((Math.pow(2, j))*b) + s) ;
                
                System.out.print(s + " ");
                
            }
            System.out.println();
        }
        in.close();
    }
}
