package array_of_objects;

import java.util.Scanner;

public class DrinksMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("드링크 갯수 입력");

		int drinkCnt = sc.nextInt();

		Drink[] drinks = new Drink[drinkCnt];

		System.out.println("드링크 이름과 가격 입력");

		for (int i = 0; i < drinks.length; i++) {

			drinks[i] = new Drink(sc.next(), sc.nextInt());

		}

		for (int i = 0; i < drinks.length; i++) {

			System.out.println(drinks[i].drinkName + " " + drinks[i].drinkPrice);

		}

		int coin = 0;

		System.out.println("돈을 넣어주세요");
		coin = sc.nextInt();

		for (int i = 0; i < drinks.length; i++) {

			if (coin >= drinks[i].drinkPrice) {
				System.out.print(drinks[i].drinkName + " " + drinks[i].drinkPrice + "\t");
			}

		}

		sc.close();

	}

}
