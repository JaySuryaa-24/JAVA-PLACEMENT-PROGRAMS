import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int kl=a%10;
	    int ld=a/100;
	    int sum=kl+ld;
		System.out.println(sum);
	
	}
}
