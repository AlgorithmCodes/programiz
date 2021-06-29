package java_intro;

import java.util.ArrayList;

public class WhileLoop {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("ghost");
		list.add("host");
		list.add("ost");
		list.add("st");

		for (String string : list) {
			System.out.println(string);
		}
		
		int i=0;
		
		while(i<list.size()) {
			
			System.out.println(list.get(i));
			i++;
		}
	}

}
