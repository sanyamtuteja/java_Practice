//java-program-swap-first-last-characters-words-sentence/

package hackerRank;

public class swapletters {

	public static void main(String[] args) {

		String st = "Sanyam is my name.";
			System.out.println(	SwapLettersofWords(st));	
	}

	
	
	public static String SwapLettersofWords(String str){
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i<ch.length; i++){
			
			int k = i;
			
			while(i<ch.length && ch[i] != ' ')
			i++;
			
			char temp = ch[k];
			ch[k] = ch[i-1];
			ch[i-1] = temp;
			
		}
	return new String(ch);
	}
}
