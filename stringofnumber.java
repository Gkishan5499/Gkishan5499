package string12;
import java.util.*;
public class stringofnumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("inter the input:");
		String str=scanner.nextLine();
		int n=1;
		 char am=0;
		for(int i=0; i<str.length();i++) {
			am=str.charAt(i);
			if(am==' ') {
				n++;
				
			}
			
		}
		System.out.println("length of word:"+n);

	}

}
