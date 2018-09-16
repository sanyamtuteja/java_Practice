package Amazon;

public class reverseWords {
	
	static void reverse(String str){
		String[] Words = str.split(" ");
		StringBuilder rev = new StringBuilder();
		
		for (int i = Words.length-1 ; i >= 0; i--){
			rev.append(Words[i]).append(" ");
		
		}
		System.out.println(rev);	
			
	}

	static void reverseWords1(String str){
		String[] Words = str.split(" ");
		StringBuilder reverse = new StringBuilder();

		for (String wrd : Words){
		for (int i = wrd.length()-1 ; i >= 0; i--){
			reverse.append(wrd.charAt(i));
		}
		reverse.append(" ");
		}
		System.out.println(reverse);	
			
	}
	
	
	static void reverseAlternate(String str){
		String[] Words = str.split(" ");
		StringBuilder rev = new StringBuilder();
		
		for (int i = 0 ; i<Words.length; i++){
			if(i%2==1){
				rev.append(Words[i]).append("");
				
			}
			else{
				for(int j=Words[i].length()-1;j>=0;j--){
					String s=Words[i];
					
					rev.append(s.charAt(j));
					
				}
			}
			
			rev.append(" ");
					
		}
		System.out.println(rev);	
		
	}
	
	static void Middle(String str){
		int n = str.length();
		int mid = 0;
				
		if (n%2==0){
			mid = (n-1)/2;
			System.out.println("Even String:" +str.charAt(mid) +str.charAt(mid+1));
			
		}else{
			mid = (n-1)/2;
			System.out.println("Odd String:" +str.charAt(mid));
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//reverse("Hello Good Morning");
		reverseAlternate("Hello Good Morning nanshu");
			//reverseWords1("Hello Good Morning");
			
			
			//String str1 = "nashu";
			//Middle(str1);
	}

}
