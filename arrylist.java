package ARRAy1;
import java.util.*;

public class arrylist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arry[]= {2,3,5,6,7};
		int n=0;
		char ams=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0; i<arry.length;i++) {
		       arr.add(arry[i]);
		    
		       
		}
		System.out.println(arr);
		System.out.print("Do you want to add the number in array? y/n:");
	     ams=sc.next().charAt(0);
		int i=0;
		while(ams=='y') {
			System.out.print("Enter the number:");
			arry[i]=sc.nextInt();
			  n=arry[i];
			  arr.add(n);
			  
			  System.out.println(arr);
			  System.out.print("Do you want to add the number in array? y/n:");
			     ams=sc.next().charAt(0);
			
		}
	  System.out.println("End The Programm@!");
		
           
	}

}
