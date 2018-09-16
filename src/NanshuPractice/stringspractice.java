package NanshuPractice;

import java.util.Scanner;

public class stringspractice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	stringspractice obj = new stringspractice();
	
	String str = sc.nextLine();
	System.out.println("Entered String is : "+str);
//	obj.wordsInString(str);

	obj.numOfOcc(str, 'a');
	
	}

		public void wordsInString(String str1)
	{
		/*
		String[] words = str1.trim().split(" ");
		System.out.println("Words are: "+words.length);
		*/		
		int count = 0;	
		for(int i=0;i<str1.length()-1;i++)
		{
			if((str1.charAt(i) == ' ') && (str1.charAt(i+1) != ' '))
			{			
				count++;
			}
		System.out.println("Count of words is :"+count);
		}
	}
	
	
	public void numOfOcc(String str2, char c)
	{
	int occ = 0;
	for(int i=0; i <str2.length(); i++)
		{
		if(str2.charAt(i)==c)
			{
			occ++;
			}
		}
	System.out.println("The total number of occurrences of a given character in a string are : " +occ);
	}
	
	
	
	
	
	
	
	
}
























