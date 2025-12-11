import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double f=sc.nextDouble();
	    double celsius=((f-32)*(5/9));
		System.out.println(celsius);
	}
}
