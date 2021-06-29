package programs160_171;

import java.util.LinkedList;
import java.util.List;

public class Pr_170_169_AddRemoveElements {
	
	
	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Maths");
		linkedList.add("Social");
		linkedList.add("Science");
		System.out.println(linkedList.toString());
		
		linkedList.remove(2);
		System.out.println(linkedList.toString());
		
		linkedList.add(2, null);
		System.out.println(linkedList.toString());
		linkedList.add(3, null);
		System.out.println(linkedList.toString());
		linkedList.add(4, null);
		System.out.println(linkedList.toString());
	}

}
