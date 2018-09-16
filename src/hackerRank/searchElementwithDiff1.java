
//Search an element in an array where difference between adjacent elements is 1


package hackerRank;

public class searchElementwithDiff1 {

	public static void main(String[] args) {

		int arr[] = {8 ,7, 6, 7, 6, 5, 4, 3, 
                2, 3, 4, 3 };
		int n = arr.length;
		int x = 8;
		System.out.println("Element " + x + 
     " is present at index "
         + search(arr,n,x));
	}
	
	
    static int search(int arr[], int n, int x){
    	
    	int i = 0;
    	
    	while(i<n){
    		if (arr[i]==x)
    			return i;
    			
    			i = i+Math.abs(arr[i]-x);
    		}
    		System.out.println ("number is not present!");

    			return -1;		
    	}
    }


