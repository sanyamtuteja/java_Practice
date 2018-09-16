package Amazon;

public class printSumofAlphabetsAlong {

	
	
	
	
	public static void main(String[] args) {

		
		StringBuilder str1 = new StringBuilder("aabbcccaaadd");
		StringBuilder str2 = new StringBuilder();

		int count = 1;
		for (int i = 0; i<str1.length()-1;i++){
			
			if (str1.charAt(i)==str1.charAt(i+1))
				{
					count++;
				}
			else{
				str2=str2.append(str1.charAt(i)).append(count);

				count=1;
			}
				
		}
		
		str2= str2.append(str1.charAt(str1.length()-1)).append(count);
				System.out.println(str2);

	}

}
