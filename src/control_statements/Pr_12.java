package control_statements;

public class Pr_12 {
	
	public static void main(String[] args) {
		
		int a=987;
		int rev=0;
		while(a>0) {
			int temp=a%10;
			rev=rev*(10)+temp;
			a=a/10;
		}
		System.out.println(rev);
	}

}
