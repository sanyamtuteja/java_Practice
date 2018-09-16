package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubStringProblem {

    public static void main(String[] args) {
    	String s = "aaaaabcd";
		String substring[] = findSubstring(s);
	}

	private static String[] findSubstring(String s) {
		char[] ch = s.toCharArray();
		int firstVowel = getFirstVowelIndex(s);
		int firstConsonent = getFirstConsonentIndex(ch, firstVowel);
		String firstsubstring = s.substring(firstVowel, firstConsonent+1);

		

		int lastConsonent = getlastConsonentIndex(ch);
		int lastVowel = getLastVowelIndex(ch, lastConsonent);
		String lastsubstring = s.substring(lastVowel , lastConsonent+1);

		
		System.out.println(firstsubstring);
		System.out.println(lastsubstring);
		
		return null;
	}

	private static int getlastConsonentIndex(char[] ch) {
		int lastIndex = ch.length-1;
		while(isVowel(ch[lastIndex])){
			lastIndex --;
		}
		return lastIndex;
	}

	private static int getLastVowelIndex(char[] ch, int beforeIndex) {
		int lastIndex = beforeIndex;
		while(!isVowel(ch[lastIndex])){
			lastIndex --;
		}
		return lastIndex;	}

	private static int getFirstConsonentIndex(char[] c, int fromIndex) {
		while(isVowel(c[fromIndex])){
			fromIndex ++;
		}
		return fromIndex;
	}

	private static int getFirstVowelIndex(String s) {
		List<Integer> indexList = new ArrayList<Integer>();
		int index = s.indexOf('a');
		if(index != -1)
			indexList.add(index);
		index = s.indexOf('e');
		if(index != -1)
			indexList.add(index);
		index = s.indexOf('i');
		if(index != -1)
			indexList.add(index);
		index = s.indexOf('o');
		if(index != -1)
			indexList.add(index);
		index = s.indexOf('u');
		if(index != -1)
			indexList.add(index);
		
		Collections.sort(indexList);
		index = s.indexOf(indexList.get(0));
		return indexList.get(0);
	}

	private static String findFirstSubstring(char[] ch) {
		
		
		return null;
	}

	private static boolean isVowel(char c) {
		if(c == 'a' || c == 'e'  || c == 'i'  || c == 'o'  || c == 'u' ) {
			return true;
		}
		return false;
	}
}