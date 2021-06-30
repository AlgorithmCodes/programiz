package control_statements;

public class Pr_14 {

	public static void main(String[] args) {
		int a=454;
		int rev=0;
		int d=a;
		while(a>0) {
			int temp=a%10;
			rev=rev*(10)+temp;
			a=a/10;
		}
		if(d==rev)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
}
