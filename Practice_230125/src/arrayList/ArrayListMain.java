package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

import model.Member;

public class ArrayListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("멤버 수 입력");
		int memberCnt = sc.nextInt();

		ArrayList<Member> memList = new ArrayList<Member>();

		for (int i = 0; i < memberCnt; i++) {
			Member mem = new Member(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(),
					sc.next());

			memList.add(mem);

		}

		for (int i = 0; i < memList.size(); i++) {

			Member memDto = memList.get(i);

			System.out.println(memDto.getPwd());

		}

		sc.close();

	}

}
