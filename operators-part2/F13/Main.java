import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double l=sc.nextDouble();
	    double b=sc.nextDouble();
	    double h=sc.nextDouble();
	   
	    double cc=2*(l*b+b*h+h*l);
	    double vc=(l+b+h);
	    
	    
		System.out.println(cc);
		System.out.println(vc);
	}
}