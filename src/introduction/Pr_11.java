package introduction;

public class Pr_11 {
	
	public static void main(String[] args) {
		char c='s';
		String str="asasahJJSSJass";
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			char k=str.charAt(i);
			if(k==c) {
				count++;
			}
		}
	System.out.println("Character "+c+" appeared "+count+" times");	
		
	}

}
