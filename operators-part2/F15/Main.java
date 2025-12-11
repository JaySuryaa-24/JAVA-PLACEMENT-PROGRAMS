import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double radius=sc.nextDouble();
	    double height=sc.nextDouble();
	   
	    double ac= 2 * Math.PI * radius * (radius + height);
	    double vc=Math.PI * radius * radius * height;

	    
	    
		System.out.println(ac);
		System.out.println(vc);
		
	}
}