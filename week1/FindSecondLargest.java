package week1.day2;
import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {23,34,89,56,21};
		int length = data.length;
		Arrays.sort(data);
		System.out.println("Sorted Array : "+Arrays.toString(data));
		System.out.println("Last Second largest number from sorted Array : "+data[length-2]);
		
	}

}
