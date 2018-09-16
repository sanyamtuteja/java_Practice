package Amazon;

public class palindrome {

	
	public static boolean isPalindrome(String s){
		StringBuilder sb = new StringBuilder();
		
		char[] arr = s.toCharArray();
		
		for(int i=arr.length-1; i>=0 ; i--){
			sb = sb.append(arr[i]);
		}
		System.out.println(sb);
		
		if (sb.toString().equalsIgnoreCase(s)){
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {

		System.out.println(isPalindrome("12121"));
		
	}

}
