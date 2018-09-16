package Amazon;

public class ConsecutiveChar {

	static char ConsecutiveCharacter(String str){
		 
		char res = str.charAt(0);
		int Count=0;
		int cur_count = 1;
		
		for(int i= 0;i<str.length()-1;i++){
			
			if (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
				cur_count++;
			}
			else {
				if(cur_count>Count){
					
					Count = cur_count;
					res=str.charAt(i);
				}
				cur_count=1;
			}
		}
		
		
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str = "Amazon is a great company as it haas AtoooZzz";
        System.out.println(ConsecutiveCharacter(str));
	}

}
