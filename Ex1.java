import java.util.Scanner;
public class Ex1{
    public static void main(String []args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter enter number of seconds: ");
        int s = a.nextInt();
        int m = s/60;
        int h = m/60;
        System.out.printf("%.2f seconds = %.2f minutes = %.2f hours",s,m,h);
    }
}