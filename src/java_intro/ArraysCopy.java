package java_intro;

import java.util.Arrays;

public class ArraysCopy {
	
	public static void main(String[] args) {
		
		
		int[] source= {1,5,47,89,8,9,};
		int b[]=new int[source.length];
		for (int i : source) {
			System.out.println(i);
		}
	System.arraycopy(source, 0, b, 0, source.length);	
	System.out.println(b[4]);
	int c[]=Arrays.copyOfRange(source, 0, 3);
	System.out.println("==========sub array================");
	for (int i : c) {
		System.out.println(i);
	}
	}
	
}
