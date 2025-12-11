import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();//5
	    int b=sc.nextInt();//2
	    a=a+b;//7 a=7
	    b=a-b;//b=7-2=5
	    a=a-b;//a=12-5=2
		System.out.println(a);
		System.out.println(b);
	}
}
