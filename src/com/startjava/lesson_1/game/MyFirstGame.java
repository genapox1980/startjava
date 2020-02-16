package com.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int hiddenNumber = 50;
		int enterNumber = 55;

		do {
			if (enterNumber < hiddenNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				enterNumber++;
			} else if (enterNumber > hiddenNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				enterNumber--;
			}
		} while (hiddenNumber != enterNumber);
		System.out.println("Вы угадали!");
	}	
}