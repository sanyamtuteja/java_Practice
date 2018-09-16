package Amazon;

import java.util.Scanner;

public class largestSumSubArray {
	
	
	public static int Sum(int[] ar, int size){
		int curr_max = ar[0];
		int max_so_far = ar[0];
		
		for(int i=1;i<size;i++)
		{
			curr_max = Math.max(ar[i], curr_max+ar[i]);
			max_so_far = Math.max(max_so_far,curr_max);
		}
		
	return max_so_far;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	System.out.println("enter");
	
	int n = Integer.parseInt(scan.nextLine().trim());
	
	int[] arr = new int[n];
	
	String[] arrItems = scan.nextLine().split(" ");
	
	for (int arrItr = 0; arrItr < n; arrItr++) {
	    int arrItem = Integer.parseInt(arrItems[arrItr].trim());
	    arr[arrItr] = arrItem;
	}

int result = Sum(arr, arr.length);

System.out.println("Largest sum ="+result);
}
		
	}

