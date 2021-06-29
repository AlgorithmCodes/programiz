package type_conversion;

import java.util.Arrays;

public class Pr_1 {
	
	public static void main(String[] args) {
		
		char c='s';
		String charstr=String.valueOf(c);
		System.out.println(charstr);
		
		char carr[]= {'c','f','f','g'};
		String chararrstr=String.valueOf(carr);
		System.out.println(chararrstr);
		
		String str="ahshhhdhd, n nks, ";
		char[] strchararr=str.toCharArray();
		System.out.println(Arrays.toString(strchararr));
	}

}
