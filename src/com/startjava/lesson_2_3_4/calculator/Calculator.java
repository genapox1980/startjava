package com.startjava.lesson_2_3_4.calculator;

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
				int exp = (int) Math.pow(num1, num2);
				System.out.println(exp);
				break;
			default:
				System.out.println("Неверный знак математической операции");	
		}
		return result;
	}
}