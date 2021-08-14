package ARRAy1;

public class Arraygreat {
   
	public static void main(String[] args) {
		
		int arry[]= {102,23,45,2,30,90,79};
		int max=arry[0];
		for(int i=0; i<arry.length;i++) {
			
			if(max<arry[i]) {
				max=arry[i];
				
			}
			
			
		}
		
		System.out.println( "greatest number of Array =" +max);
		

	}

}
