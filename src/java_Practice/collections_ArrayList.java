package java_Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class collections_ArrayList {
	
	public static void main(String[] args) {

		
		ArrayList<String> al = new ArrayList<String>();
		al.add("A1");
		al.add("A2");
		al.add("A3");
		al.add("A4");
		al.add("A5");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("B1");
		al2.add("A2");
		al2.add("B3");
		
		//al.addAll(al2);
		
		//al.removeAll(al2);

		al.retainAll(al2);
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
	}

}
