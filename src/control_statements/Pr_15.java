package control_statements;

public class Pr_15 {
	
	public static void main(String[] args) {
		
		int a=10;
		int count=0;
		for (int i = 2; i <a/2 ; i++) {
			
			if(a%i==0) {
				count++;
			}
			
		}
		
		if(count==0)
			System.out.println("Prime number");
		else
			System.out.println("not a prime number");
	}

}
