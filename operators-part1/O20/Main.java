import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    int e=sc.nextInt();
	    int m=sc.nextInt();
	    int s=sc.nextInt();
	    int h=sc.nextInt();
	    int tot=(t+e+m+s+h);
	    
	    if(tot>300){
	        System.out.println("Pass");
	    }
	   
	    else{
	        System.out.println("Fail");
	        
	    }
	}}