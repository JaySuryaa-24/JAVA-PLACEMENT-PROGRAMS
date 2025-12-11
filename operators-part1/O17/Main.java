import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int num = sc.nextInt();

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println("is power of 2");
        } else {
            System.out.println( " is NOT a power of 2");
        }
    }
}
