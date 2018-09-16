//Given an array A[] and a number x, check for pair in A[] with sum as x




package NanshuPractice;

import java.util.HashSet;

public class printPairs {

	public static void main(String[] args) {

		 int A[] = {1, 4, 45, 6, 10, 8};
	        int n = 16;
	        printpairssum(A,  n);
	}

	
	
	
	public static void printpairssum(int arr[], int sum){
		
		HashSet<Integer> hs = new HashSet<>();
		for (int i=0; i<arr.length;i++ ){
			int temp = sum-arr[i];
			
				if(temp >=0 && hs.contains(temp)){
					
					System.out.println("sum of the pair is given by:"+arr[i]+"," +temp);
					
				}
				hs.add(arr[i]);
		}
	}
	
	
}
