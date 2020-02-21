package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int number;
	private int[] numbers = new int[10];
	private int countAttempts = -1;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return numbers[countAttempts];
	}

	public void setNumber(int number) {
		this.number = number;
		countAttempts++;
		numbers[countAttempts] = number;
	}

	public int[] getNumbers() {
		return Arrays.copyOf(numbers, (countAttempts + 1));
	}

	public int getCountAttempts() {
		return countAttempts;
	}

	void clear() {
		Arrays.fill(numbers, 0, (countAttempts), 0);
		countAttempts = -1;
	}
}