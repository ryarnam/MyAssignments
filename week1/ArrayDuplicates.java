package week1.day2;
import java.util.Arrays;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x= {3,2,11,4,9,7};
		int [] y= {1,2,8,4,6,7};
		
		int lengthx =x.length;
		int lengthy =y.length;
		
		
		for(int i=0;i<lengthx;i++) {
			for(int j=0;j<lengthy;j++) {
				
				if (x[i]==y[j]) {
					
					System.out.println("Duplicates Numbers:" +x[i]);
				
				
				
			
			}
			}
			
		}
		
		
		
	}
	}