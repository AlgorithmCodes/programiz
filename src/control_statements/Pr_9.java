package control_statements;

public class Pr_9 {
	
	public static void main(String[] args) {
		
		int n1=120,n2=90,lcm;
		
		lcm=(n1>n2)?n1:n2;
		
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
	}

}
