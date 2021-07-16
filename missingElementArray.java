package week1.Day2Assignment;

import java.util.Arrays;

public class missingElementArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
	Arrays.sort(arr);
	
for(int i=0;i<arr.length;i++)
{
	if ((i + 1) != arr[i]) {
		
		int miss = i + 1;
		System.out.println(miss + ":is the missing element");
		break;
	}
}
	}

}

