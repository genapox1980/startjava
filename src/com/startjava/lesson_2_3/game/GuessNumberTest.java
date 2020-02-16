package com.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String continuation;

		System.out.print("Введите имя первого игрока: ");
		Player player1 = new Player(scan.nextLine());

		System.out.print("Введите имя второго игрока: ");
		Player player2 = new Player(scan.nextLine());	

		do {
			GuessNumber guess = new GuessNumber(player1, player2);
			guess.startGame();

			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				continuation = scan.next();
			} while (!continuation.equals("нет") && !continuation.equals("да"));	 
		} while (continuation.equals("да"));		
	}
}