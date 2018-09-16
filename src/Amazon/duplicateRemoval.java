package Amazon;

import java.util.HashSet;
import java.util.Set;

public class duplicateRemoval {
	
	
	public int removeDuplicate(int[] a, int n){
		
		if(n==0 || n == 1)
		{
			return n;
		}
			Set<Integer> set = new HashSet<Integer>();
			int j=0;
			for(int i =0; i<n-1;i++)
			{
				if(a[i]!= a[i+1])
				{
					a[j]=a[i];
					j++;
				}
				else 
					set.add(i);
			}
			
			a[j]=a[n-1];
			return j;
		}
		


	public static void main(String[] args) {

	}

}
