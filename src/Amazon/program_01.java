package Amazon;

import java.util.Scanner;

public class program_01 {
	public static void main(String args[])
	{
	int x=10, y=20;
		
		System.out.println("Hello");
//	program_01 obj = new program_01();
	
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius of the circle");
	int r = sc.nextInt(); // radius
	
	int number = sc.nextInt();// to revese
	reversenumber(number);
	areacircle(r);
	
	
	
	
	swap_01(x,y);
	
	}


	public static void swap_01(int a, int b)
	{
		System.out.println("before swapping");
		System.out.println("Value of a:" +a);
		System.out.println("Value of b:" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping");
		System.out.println("Value of a:" +a);
		System.out.println("Value of b:" +b);
	}
	
	
	public static void areacircle(float r){
		
		System.out.println("Area of the Circle is:" +(3.14*r*r));
	
	
	}
	
	public static void reversenumber(int num){
		
		int reverse = 0;
		int temp = 0;
		
		while(num>0){
			
			temp = num%10;
			
			reverse = reverse*10+temp;
			
			num= num/10;
			}
		System.out.println("reverse of the number is:"+reverse);
		
		
	}
	
	
	
	
	
	
	
	
	}
	
	
	



