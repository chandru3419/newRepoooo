package all_Type_of_numbers;

public class fib {

	public static void main(String[] args) {
		int fib=0;
		int fib1=1;
		int fib2;
		
		
//		System.out.println(fib+" "+fib1+" ");
	
		for (int i = 0; i < 10; i++) {
			
			fib2=fib+fib1;
		
		fib=fib1;
		fib1=fib2;
		System.out.print(fib2+" ");
		
		}
		
	}
}
