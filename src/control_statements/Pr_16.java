package control_statements;

public class Pr_16 {
	
	public static void isPrime(int a) {
		
		int count=0;
		for (int i = 2; i <a/2 ; i++) {
			
			if(a%i==0) {
				count++;
			}
			
		}
		
		if(count==0)
			System.out.println(a);
		
	}

	public static void main(String[] args) {
		int first_number=10;
		int last_number=100;
		
		for (int i = first_number; i <=last_number; i++) {
			
			Pr_16.isPrime(i);
		}
		
		
	}
}
