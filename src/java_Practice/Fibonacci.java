package java_Practice;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		f.Fib(11);
	}
	
	public void Fib(int N){
		int[] arr = new int[N];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<N;i++){
			
			arr[i] = arr[i-1]+arr[i-2];
		}
		for(int i=0;i<N;i++){
			System.out.println(+arr[i]);
		}

	}
	

}
