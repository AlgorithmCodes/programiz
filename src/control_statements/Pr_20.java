package control_statements;

public class Pr_20 {
	
	
	public static void main(String[] args) {
		int a=1000;
		int b=584;
		
		String s="+";
		
		switch(s) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		case "%":
			System.out.println(a%b);
			break;
		default:
			System.out.println("Not valid");
		}
		
		
		
	}

}
