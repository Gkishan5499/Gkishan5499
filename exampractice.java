package ARRAy1;
import java.util.*;
class prime {
	int x=0;
	public void num1(int a) {
		
		int m=x/2;
		for(int i=2; i<=m;i++) {
			if(a%i==0) {
				System.out.println("composite number:");
				x=1;
				break;
			}
		}
		if(x==0) {
			System.out.println("prime number:");
		}
		
	
		
	}
	public void num2(int n1, int n2) {
	  for(n1=2;n1<=n2; n1++) {
		  System.out.println(n1);
		}
	}
	
}

public class exampractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	 prime p=new prime();
	
	 p.num2(10, 30);
	 System.out.print("Enter the number:");
	 int d=sc.nextInt();
	 p.num1(d);
	}

}
