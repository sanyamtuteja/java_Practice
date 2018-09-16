package Amazon;

public class firstOccurence {

	public static int firstOccurenceofNumber(int[] ar, int n, int x){
		int i =0;
		
		
		while (i<n){
			if(ar[i]==x)
				return i;
			
			
				i=i+ Math.abs(ar[i]-x);
			
			}
		 System.out.println ("number is not" +
                 " present!");

		 	return -1;
		}
		
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 4 };
		int n = arr.length;
		int x = 2;
		System.out.println("Element " + x + 
		     " is present at index "
		         + firstOccurenceofNumber(arr, n, x));
	}

}
