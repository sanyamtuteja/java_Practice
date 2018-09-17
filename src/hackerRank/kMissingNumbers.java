package hackerRank;

import java.util.Arrays;

public class kMissingNumbers {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4 };
        int n = arr.length;
        int k = 3;
        printkMissing(arr, n, k);

	}
	
	
	public static void printkMissing(int[] arr, int n, int k) {
		
		Arrays.sort(arr);
		
		int i = 0;
		while (i<n && arr[i]<= 0)
			i++;
		
		int count = 0;
		int curr = 1;
		
		while (i < n && count < k) {
			if(arr[i] != curr) {
				System.out.println(curr);
				count++;
				
			}else
			i++;
			curr++;
		}
		
		while (count < k) 
		{
            System.out.print(curr + " ");
            curr++;
            count++;
		}
	
	}
}