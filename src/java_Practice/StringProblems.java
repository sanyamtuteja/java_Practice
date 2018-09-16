package java_Practice;

public class StringProblems {

	public static void main(String[] args) {

		String str = "@S@ny@m&";
        char[] charArray = str.toCharArray();
 
        System.out.println("Input string: " + str);
        
        reverse(charArray);
        String revStr = new String(charArray);
 
        System.out.println("Output string: " + revStr);
    }
	
	public static void reverse(char str[])
    {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;
         // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r)
        {
            // Ignore special characters
            if (!Character	.isAlphabetic(str[l])){
                System.out.println("in if");
            	l++;
            }
            if(!Character.isAlphabetic(str[r])){
                System.out.println("in if ");
                r--;
            }
            // Both str[l] and str[r] are not spacial
            else
            {
            	System.out.println("in else");
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }

	    static final int ASCII_SIZE = 256;
	    static char getMaxOccuringChar(String str)
	    {
	        // Create array to keep the count of individual
	        // characters and initialize the array as 0
	        int count[] = new int[ASCII_SIZE];
	      
	        // Construct character count array from the input
	        // string.
	        int len = str.length();
	        for (int i=0; i<len; i++){
	            count[str.charAt(i)]++;
	        
	        }
	        int max = -1;  // Initialize max count
	        char result = ' ';   // Initialize result
	      
	        // Traversing through the string and maintaining
	        // the count of each character
	        for (int i = 0; i < len; i++) {
	            if (max < count[str.charAt(i)]) {
	                max = count[str.charAt(i)];
	                result = str.charAt(i);
	            }
	        }
	      
	        return result;
	    }}
