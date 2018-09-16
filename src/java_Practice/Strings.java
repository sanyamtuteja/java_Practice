package java_Practice;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Strings{
	
	
	public void Swap(String str1, String str2) {
		
//		Scanner scn = new Scanner(System.in);
//		
//		String str1 = scn.nextLine();
//		String str2 = scn.nextLine();
		
		System.out.println("String 1 is:- "+str1);
		System.out.println("String 2 is:- "+str2);
	
	str1 = str1 + str2;
	
	str2 = str1.substring(0,(str1.length()-str2.length()));

	str1 = str1.substring(str2.length());
	
	System.out.println("String 1 is:- "+str1);
	System.out.println("String 2 is:- "+str2);
	}

	
	public void TestString() {

				System.gc();
			long start=new GregorianCalendar().getTimeInMillis();
			long startMemory=Runtime.getRuntime().freeMemory();
			StringBuffer sb = new StringBuffer();
			//StringBuilder sb = new StringBuilder();
			for(int i = 0; i<100000; i++){
				sb.append(":"+i);
				sb.insert(i, "Hi");
			}
			long end=new GregorianCalendar().getTimeInMillis();
			long endMemory=Runtime.getRuntime().freeMemory();
			System.out.println("Time Taken:"+(end-start));
			System.out.println("Memory used:"+(startMemory-endMemory));
		}

	
	
	public static void main(String[] args) {
				
		Strings obj = new Strings();
	/*	Scanner scn = new Scanner(System.in);
		
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		obj.Swap(s1, s2);
		scn.close();
	*/		
	
	obj.TestString();
	
	}

}
