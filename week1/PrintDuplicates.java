package week1.day2;
import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int lengtharr =arr.length;
		int count=0;
		for (int i=0;i<=arr.length;i++) {
			for (int j=i+1;j<=i+arr.length;j++) {
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[i]);
				}
			}
			
		}
		
		
		
		

		
	}

}
