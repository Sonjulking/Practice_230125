package data_structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("고양이", 50);
		map.put("쥐", 30);
		map.put("호랑이", 100);

		System.out.println(map.get("고양이"));
		System.out.println(map.keySet());

		for (String s : map.keySet()) {
			System.out.println(map.get(s));
		}

		String search = sc.next();

		if (map.containsKey(search)) {
			System.out.println(map.get(search));
		} else {
			System.out.println("이상해용");
		}

		sc.close();

	}

}
