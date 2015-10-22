package array;
import java.util.Arrays;
public class arraymain {

	public static void main(String[] args) {
		int [] aryNums;
		int sum = 0, average;
		aryNums = new int [6];
		
		aryNums [0] = 123;
		aryNums [1] = 456;
		aryNums [2] = 479;
		aryNums [3] = 135;
		aryNums [4] = 246;
		aryNums [5] = 135;
		
		Arrays.sort(aryNums);
		int i;
		for (i= 0; i <  aryNums.length; i++)
		{
			System.out.println("num:"+ aryNums[5]);
	    }
			
		
		sum = ( aryNums[1]+aryNums[2]+aryNums[3]+aryNums[4]+aryNums[0]+aryNums[5]);
		average = (sum / 5);
		
		System.out.println("The Average is : "+average);
		
		
	}

}
