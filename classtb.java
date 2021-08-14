package string12;
import java.util.*;
class numbers{
	int num=0;
	int m,n;
	public void getdata(int x) {
		n=x;
		
		  }
	public void check() {
		m=n/2;
		if(n/2==0||n/2==1) {
			System.out.println("This is composite number!");
		}
		
		for(int i=2; i<=m;i++) {
			
			if(n%i==0) {
				System.out.println("This is composite number!");
				num=1;
				break;
			}
			
		
	
		}
		if(num==0) {
			System.out.println("This is prime number!");
	
		}
	}
	
	
}

public class classtb {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int m=sc.nextInt();
		numbers s=new numbers();
		s.getdata(m);
		s.check();
		
		
	}

}
