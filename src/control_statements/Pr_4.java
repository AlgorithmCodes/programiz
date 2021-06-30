package control_statements;

public class Pr_4 {
	
	public static void main(String[] args) {
		
		int last_number=100;
		int sum=0;
		
		for (int i = 1; i <=last_number; i++) {
			sum+=i;
		}
		
		System.out.println("Sum of natural numbers:"+sum );
	}

}
