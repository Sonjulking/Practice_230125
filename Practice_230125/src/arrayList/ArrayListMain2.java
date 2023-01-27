package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

import model.Student;

public class ArrayListMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int stdCnt = sc.nextInt();
		sc.nextLine();

		ArrayList<Student> stdList = new ArrayList<Student>();

		for (int i = 0; i < stdCnt; i++) {

//			Student std = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
//					sc.nextLine());
//
//			stdList.add(std);

			stdList.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
					sc.nextLine()));

		}

		for (int i = 0; i < stdList.size(); i++) {

			Student stdDto = stdList.get(i);

			System.out.println(stdDto.getName());

		}
		sc.close();
	}

}
