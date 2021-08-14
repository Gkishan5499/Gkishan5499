package ARRAy1;

import java.util.Arrays;

public class arraylist {

	public static void main(String[] args) {
		int my_arry[]= {23,45,44,65,56,76,80};
		int remindex=1;
		for(int i=remindex; i<my_arry.length-1;i++) {
			my_arry[i]=my_arry[i+1];
			
		}
      System.out.println(Arrays.toString(my_arry));
	}

}
