package com.startjava.lesson_2_3.calculator;

public class Calculator {
	
	public int calculate(int num1, int num2, char operation) {
		int result = 0;
		switch (operation) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			case '^':
				int exp = 1;
				for (int i = 1; i <= num2; i++) {
					exp *= num1;
				}
				System.out.println(exp);
				break;
			default:
				System.out.println("Неверный знак математической операции");	
		}
		return result;
	}
}