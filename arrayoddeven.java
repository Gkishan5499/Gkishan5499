package ARRAy1;
import java.util.*;

public class arrayoddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int ary[]=new int[6];
		 System.out.println("Enter the number:");
		 for(int i=0;i<6;i++) {
			   ary[i]=sc.nextInt();
			  
		 }
		 for(int i=0; i<6; i++) {
			 if(ary[i]%2==0) {
				   System.out.print("  "+ary[i]+" ");
			   }
			
			 
		 }
		 System.out.print("=Even number \n");
		 for(int i=0; i<6; i++) {
			 if(ary[i]%2!=0) {
				 System.out.print("  " +ary[i]+" ");
				 
			 }
		 }
		 System.out.print(" =Odd Number");
		
	}

}
