package Amazon;

public class NonRepetitiveChars {
	
	static final int no_of_chars = 256;
	static char[] count = new char[no_of_chars];
		
	static void getCharCountArray(String str) 
    {
        for (int i = 0; i < str.length();  i++)
             count[str.charAt(i)]++;
    }
	
	public static int firstNonRepetitive(String str){
		getCharCountArray(str);
		int index = -1;
		for(int i=0; i<str.length();i++){
				if (count[str.charAt(i)]==1){
					index = i;
					break;
			}
				
		}
		System.out.println(str.charAt(index));

		return index;
	}

	public static void main(String[] args) {
		
		int a = firstNonRepetitive("arizona");
		
		System.out.println(a);
	}

}
