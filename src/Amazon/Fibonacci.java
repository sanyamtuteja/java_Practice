package Amazon;

public class Fibonacci {
	
	
	public static void fibonacci(int n){
		
		int a = 0;
		int b = 1;
		int c;
		for (int i = 2;i < n;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
			
		}
	static int a = 0;
	static int b = 1;
	static int c = 0;
		public static void recursivefibonacci(int n){
			
			
			if(n>0){
				c=a+b;
				a=b;
				b=c;
				System.out.println(c);
				
				recursivefibonacci(n-1);
				
			}
		
		
	}

	public static void main(String[] args) {
		//fibonacci(10);
		recursivefibonacci(10);

	}

}
