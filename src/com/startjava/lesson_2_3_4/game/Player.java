package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int[] numbers = new int[10];
	private int countAttempts;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return numbers[countAttempts-1];
	}

	public void setNumber(int number) {
		numbers[countAttempts] = number;
		countAttempts++;
	}

	public int[] getNumbers() {
		return Arrays.copyOf(numbers, countAttempts);
	}

	public int getCountAttempts() {
		return countAttempts;
	}

	void clear() {
		Arrays.fill(numbers, 0, countAttempts, 0);
		countAttempts = 0;
	}
}