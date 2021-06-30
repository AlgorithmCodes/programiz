package control_statements;

public class Pr_7 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int count=0;
		System.out.println(a);
		while(count<=14) {
			a=b;
			b=c;
			 c=a+b;
			 System.out.println(c);
			
			count++;
		}
		
	}
}
