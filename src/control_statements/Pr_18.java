package control_statements;

public class Pr_18 {
	
	public static void isArmStrong(int a) {

		
		int number=a;
		int digitCount=String.valueOf(a).length();
		int sum=0;
		
		while(a>0) {
			int temp=a%10;
			sum=(int) (sum+Math.pow(temp, digitCount));
			a=a/10;
		}
		
		if(number==sum) {
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		int fnumber=100;
		int lnumber=10000;
		
		for (int i = fnumber; i <=lnumber; i++) {
			Pr_18.isArmStrong(i);
		}
	}

}
