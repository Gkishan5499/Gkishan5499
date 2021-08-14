package string12;
import java.util.*;

public class upperlower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
	    System.out.print("intput String :");
	    String str=sc.nextLine();
	    char chr=0;
	   for(int i=0; i<str.length(); i++)
	   { 
		   String caps= str.toUpperCase();
		  chr=caps.charAt(i);
		  
		  if(chr!=' ') {
			  
			  System.out.print(chr);
		  }
		
	   }
	   

	}

}
