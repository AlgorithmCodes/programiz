package type_conversion;

public class Pr_14 {
	
	public static void main(String[] args) {
		
		int a=9;
		Integer s=(Integer)a;
		Integer d=45;
		int k=(int)d;
		
		System.out.println(a+" "+s);
		System.out.println(d+" "+k);
		
		double d1=45.89;
		Double d2=(Double)d1;
		short s1=45;
		Short s2=(Short)s1;
		
		boolean b=false;
		Boolean b1=(Boolean)b;
		
		System.out.println(b1);
		
		
	}
	

}
