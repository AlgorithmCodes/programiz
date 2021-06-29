package programs160_171;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Pr_171_AccessLinkedList {

	public void generalMethod() {

		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		for (Integer integer : linkedList) {
			System.out.println(integer);
		}

	}

	public void usingIterator() {

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Maths");
		linkedList.add("Social");
		linkedList.add("Science");

		Iterator<String> it = linkedList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void usingListIterator() {

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Maths");
		linkedList.add("Social");
		linkedList.add("Science");

		ListIterator<String> lit = linkedList.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}

	public static void main(String[] args) {
		Pr_171_AccessLinkedList.usingListIterator();
	}
}
