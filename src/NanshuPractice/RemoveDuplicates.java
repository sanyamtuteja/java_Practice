package NanshuPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class RemoveDuplicates {

	public void removedups(String str){
		
		char[] ch=str.toCharArray();
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for(int i=0;i<ch.length;i++){
			
			
				hs.add(ch[i]);
				
		}
		
		System.out.println(hs);
		
		
	}
	
	public String removewithoutcol(String word){
		
		
		Objects.requireNonNull(word);

	    char[] wordArray = word.toCharArray();

	    int len = wordArray.length;
	    for (int i = 0; i < wordArray.length; i++) {
	        int count = 0;
	        for (int j = i; j < wordArray.length; j++) {
	            if (wordArray[i] == wordArray[j]) {
	                count++;
	                if (count > 1) {
	                    wordArray[j] = 0;
	                }
	            }
	        }
	    }
	    System.out.println(String.valueOf(wordArray));
	    return String.valueOf(wordArray);
	}
	
	public static void main(String[] args) {
		
		RemoveDuplicates rd=new RemoveDuplicates();
			rd.removedups("Bananas");
			
			rd.removewithoutcol("nanshu");
		// TODO Auto-generated method stub

	}

}
