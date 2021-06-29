package type_conversion;

public class Pr_13 {

	public static void main(String[] args) {
		String s="455";
		double d=Double.parseDouble(s);
		
		System.out.println(s+" "+d);
		float f=Float.parseFloat(s);
		System.out.println(s+" "+f);
		
	}
}
