package control_statements;

public class Pr_17 {
	
	
	public static void main(String[] args) {
		
		int a=173;
		int number=a;
		int digitCount=String.valueOf(a).length();
		int sum=0;
		
		while(a>0) {
			int temp=a%10;
			sum=(int) (sum+Math.pow(temp, digitCount));
			a=a/10;
		}
		
		if(number==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not an armstrong");
		}
		
	}

}
