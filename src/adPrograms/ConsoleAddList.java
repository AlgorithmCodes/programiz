package adPrograms;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ConsoleAddList {
	
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			
			String str=sc.next();
			al.add(str);
		}
		
	System.out.println(al.toString());
	
	
	
	
	
	
	
	sc.close();
	}
	

}
