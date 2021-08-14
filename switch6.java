package string12;
import java.util.*;

public class switch6 {

	public static void main(String[] args) {
		char ab=0;
		int c=0 ;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first  number:");
		int a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b=sc.nextInt();
	    System.out.print("Are you type any sign -,+,*,/ :" );
	    ab=sc.next().charAt(0);
	    switch (ab){
	    case '+':
	    	c=a+b;
	    	
	    	break;
	
	    case '-':
	    	c=a-b;
	    	
	    	break;
	    case '*':
	    	c=a*b;
	    	
	    	break;
	    case '/':
	    	c=a/b;
	    	
	    	default:
	    System.out.println("Wrong Input:");		
	    }
	    System.out.println("Result:"+c);
	    

	}

}
