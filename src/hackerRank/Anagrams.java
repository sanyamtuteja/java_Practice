package hackerRank;

import java.util.Arrays;

public class Anagrams {
	
	

	
	public boolean findAnagrams(String str1, String str2){
		
		
		char[] ch1=str1.toLowerCase().toCharArray();
		
		char[] ch2=str2.toLowerCase().toCharArray();
		
		if(ch1.length!=ch2.length){
			
			System.out.println("they can not be anagrams");
		return false;
		}
		
		Arrays.sort(ch1);
		System.out.println(ch1);
		
		Arrays.sort(ch2);
		System.out.println(ch2);
		if(Arrays.equals(ch1, ch2)){
			
			System.out.println("Strings are anagrams");
		}
		else
		{
			System.out.println("Strings are not anagrams");
		}
		return false;
	}

	public static void main(String[] args) {
		
		Anagrams a=new Anagrams();
		a.findAnagrams("Marry", "armyr");
			
		// TODO Auto-generated method stub

	}

}
