package NanshuPractice;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution2 {
	
	public static void findSubstring(String s){
		 List<Character> vowels="aeiou".chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		 List<Character> consonants = "bcdefghjklmnpqrstvwxyz".chars().mapToObj(c->(char)c).collect(Collectors.toList());
		 PriorityQueue<String> maxHeap = new PriorityQueue<>();
		 PriorityQueue<String> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
		 
		 int length = s.length();
		 
		 for (int pass = 0; pass < length; pass++) {
				if (!vowels.contains(s.charAt(pass))) {
					continue;
				}
				for (int el = pass + 1; el < length; el++) {
					char current = s.charAt(el);
					if (!consonants.contains(current)) {
						continue;
					}
					String str = s.substring(pass, el + 1);
					minHeap.add(str);
					maxHeap.add(str);

					while (minHeap.size() > 1) {
						minHeap.poll();
					}

					while (maxHeap.size() > 1) {
						maxHeap.poll();
					}
				}
			}
			System.out.println(minHeap.peek());
			System.out.println(maxHeap.peek());
			 
			 
		 }
		 
		 
		
		
	

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        String _s;
	        String s="aabbccdd";
	        try {
	            _s = in.nextLine();
	        } catch (Exception e) {
	            _s = null;
	        }
	        
	        findSubstring(_s);
	        findSubstring(s);
	        
	    }

	}


