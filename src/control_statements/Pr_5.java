package control_statements;

public class Pr_5 {
	
	public static void main(String[] args) {
		
		int number=5;
		int factorial=1;
		for (int i = 1; i <=number; i++) {
			factorial*=i;
			System.out.println(factorial);
			
		}
		System.out.println("Factorial of "+number+" is:"+factorial);
	}

}
