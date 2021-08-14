package ARRAy1;
import java.util.*;

public class arrayfield {

	public static void main(String[] args) {
		int[] arry=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arry.length ;i++) {
			System.out.print("Enter the number:");
			arry[i]=sc.nextInt();
			
		}
		for(int i=0; i<arry.length; i++) {
			System.out.print(" "+arry[i]);
			
		}
		
		System.out.println("\n"+arry[2]);
		
	}

}
