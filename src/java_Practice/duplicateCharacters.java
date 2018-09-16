package java_Practice;

import java.util.HashMap;
import java.util.Set;

public class duplicateCharacters {

	public static void DuplicateChars(String str)
	{
		
		char[] ch1 = str.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for (Character ch : ch1)
		{
			if (charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
				else 
				{
					charMap.put(ch, 1);
				}
			
		}
		
		Set<Character> keys = charMap.keySet();
		for(Character ch : keys)
		{
            if(charMap.get(ch) > 1)
            {
                System.out.println(ch+"--->"+charMap.get(ch));
            }
            else 
            {
                System.out.println(ch+"--->"+charMap.get(ch));

            }
            
		}
	}
		
	public static void main(String[] args) {

		String str = "java";
		
		DuplicateChars(str);
		
		
		
	}

}
