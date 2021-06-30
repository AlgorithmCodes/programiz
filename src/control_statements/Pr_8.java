package control_statements;

public class Pr_8 {
	
	public static void main(String[] args) {
		
		int n1 =90,n2=55;
		
		for (int i = 2; i <=n2; i++) {
		
			if(n1%i==0 && n2%i==0) {
				System.err.println(i);
			}
		}
	
		
			while(n1 != n2) {
				if(n1>n2) {
				n1-=n2;	
			}
				else {
					n2-=n1;
				}
		}
			
			System.out.println(n1);
		
	}
	
	
	

}
