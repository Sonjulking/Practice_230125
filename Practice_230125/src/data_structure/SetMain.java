package data_structure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(100);
		set.add(200);
		set.add(300);

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
