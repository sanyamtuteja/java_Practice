package Amazon;


public class BinarySearch {

	public static int SearchNumber(int[] ar, int key){
		
		int l = 0;
		int r = ar.length-1;
		int m = 0;
		
		while (l<=r){
			
			m = l+(r-l)/2;
			
			if(ar[m]==key){
				return m;
			}
			if (ar[m]<key){
				l=m+1;
				
			}else 
			r=m-1;
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {

		int[] arr ={1,2,3,4,5,6,7,8,9,10};
		int a = SearchNumber(arr,9);
		System.out.println(a);
		
	}

}
