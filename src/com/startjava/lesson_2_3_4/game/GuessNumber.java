package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
	private Player gamer1;
	private Player gamer2;
	private Player currentGamer;
	private int guessNumber;

	Scanner scan = new Scanner(System.in);
	
	public GuessNumber(Player gamer1, Player gamer2) {
		guessNumber = (int) (Math.random() * 101);
		this.gamer1 = gamer1;
		this.gamer2 = gamer2;
		System.out.println(guessNumber);
	}

	public void startGame() {
		System.out.println("Компьютер загадал число от 0 до 100, попробуйте его отгадать");
		do {
			currentGamer = (currentGamer == gamer1) ? gamer2 : gamer1;
			enterNumber();
		} while (!checkNumber());          
	}

	private void enterNumber() {
		System.out.print(currentGamer.getName() + ", введите Ваше число: ");
		currentGamer.setNumber(scan.nextInt());
	}
	
	private boolean checkNumber() {
		if (currentGamer.getNumber() > guessNumber) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if (currentGamer.getNumber() < guessNumber) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали!");
			System.out.println("Игрок " + currentGamer.getName() + " закончил игру угадав число " + currentGamer.getNumber());
			return true;
		}
		return false;
	}
}