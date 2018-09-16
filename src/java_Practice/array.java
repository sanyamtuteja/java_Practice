package java_Practice;

import java.util.ArrayList;
import java.util.List;

public class array {
	
	public void ArrayOfArrayList(){

		
		List<String> L1 = new ArrayList<>();
		List<String> L2 = new ArrayList<>();
		L1.add("1");
		L1.add("2");
		
		L2.add("3");
		L2.add("4");
		L2.add("5");
		
		@SuppressWarnings("unchecked")
		List<String>[] arrayoflist = new List[2];
		arrayoflist[0] = L1;
		arrayoflist[1] = L2;
		
		
		for(int i=0;i<=arrayoflist.length;i++){
			List<String> l = arrayoflist[i];
			
			System.out.println(l);

		}
	}
	
	
	
	
	

	public static void main(String[] args) {
	
		array arr = new array();
		arr.ArrayOfArrayList();
		// TODO Auto-generated method stub

	}

}
