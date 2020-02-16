package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 4;
		char operator = '+';

		if (operator == '+') {
			System.out.println(num1 + num2);
		} else if (operator == '-') {
			System.out.println(num1 - num2);
		} else if (operator == '*') {
			System.out.println(num1 * num2);
		} else if (operator == '/') {
			System.out.println(num1 / num2);
		} else if (operator == '%') {
			System.out.println(num1 % num2);
		} else if (operator == '^') {
			int result = 1;
			for (int i = 1; i <= num2; i++) {
				result *= num1;
			}
			System.out.println(result);
		} else {
			System.out.println("Неверный математический знак");
		}
	}
}