package string12;
import java.util.*;


public class switch2 {

	public static void main(String[] args) {
		char w=0;
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the week number:");
		 w=sc.next().charAt(0);
		switch(w) {
		case  '1':
			str="Monday";
			break;
		case '2':
			str="Tuesday";
			break;
		case '3':
			str="Wednesday";
			break;
		case '4':
			str="Thursday";
			break;
		case '5':
			str="friday";
			break;
		case '6':
			str="Saturday";
			break;
		case '7':
			str="Sunday";
		     default:
		    	 System.out.println("wrong number:");
		    	 
		}
		System.out.println("Result:"+str);
		
	}

}
