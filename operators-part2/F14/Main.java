import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double radius=sc.nextDouble();
	   
	    double as= 4 * Math.PI * radius * radius;
	    double vc= (4.0/3) * Math.PI * radius * radius * radius;

	    
	    
		System.out.println(as);
		System.out.println(vc);
		
	}
}