package introduction;

public class Pr_10 {
	
	public static void main(String[] args) {
		int a=5,b=1,c=-10;
		int determinant=(b*b)-(4*a*c);
		
		if(determinant>0)
			System.out.println("Roots are real and different");
		else if(determinant==0)
			System.out.println("Roots are real and equal");
		else
			System.out.println("Roots are complex and different");
	}

}
