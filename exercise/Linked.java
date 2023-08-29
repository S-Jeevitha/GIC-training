package exercise;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Ganga");
		list.add("Yamuna");
		list.add("Narmada");

		ListIterator<String> iterator = list.listIterator(list.size());

		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}

	}
}
