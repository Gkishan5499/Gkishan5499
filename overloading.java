package string12;
import java.util.*;

class rectangle{
	int a,b,c;
	public void setdata(int x, int y) {
		a=x;
		b=y;
		c=a*b;
	}
	public void getresult() {
		System.out.println("Area of Rectangle:"+ c);
		
	}
}
public class overloading {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter length:");
		int m=sc.nextInt();
		System.out.print("Enter width:");
		int m1=sc.nextInt();
		rectangle area=new rectangle();
		area.setdata(m, m1);
		area.getresult();
		
	}

}
