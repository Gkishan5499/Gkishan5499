package string12;
import java.util.*;

public class repeatchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Strings:");
		String str=sc.nextLine();
		System.out.println("Repeated Characters:");
		int n=0;
		for(int i=0;i<str.length(); i++) {
			 
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					n++;
				}
			}
			if(n>1) {
				System.out.println(str.charAt(i)+"--"+n);
				
			}
			String d=String.valueOf(str.charAt(i));
			str=str.replace(d,"");
			n=0;
		}
		
		
	}

}
