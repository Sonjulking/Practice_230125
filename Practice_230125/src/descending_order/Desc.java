package descending_order;

import java.util.Scanner;

public class Desc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("배열갯수 입력");
		int cnt = sc.nextInt();

		int[] numArr = new int[cnt];

		System.out.println("숫자 입력");

		for (int i = 0; i < numArr.length; i++) {

			numArr[i] = sc.nextInt();

		}

		int temp = 0;

		for (int i = 0; i < numArr.length; i++) {

			for (int j = i + 1; j < numArr.length; j++) {

				if (numArr[i] < numArr[j]) {

					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;

				}

			}

		}

		System.out.println();

		for (int i = 0; i < numArr.length; i++) {

			System.out.print(numArr[i] + " ");

		}
		System.out.println();

		for (int i : numArr) {

			System.out.print(i + " ");

		}

		sc.close();

	}

}
