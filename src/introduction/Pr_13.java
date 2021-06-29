package introduction;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Pr_13 {
	
	public static void main(String[] args) {
		double d=14.7568d;
		System.out.println(Math.round(d));
		System.out.format("%.3f",d);
		System.out.println();
		DecimalFormat df=new DecimalFormat("#.#######");
		df.setRoundingMode(RoundingMode.CEILING);
		System.out.println(df.format(d));
		
	}

}
