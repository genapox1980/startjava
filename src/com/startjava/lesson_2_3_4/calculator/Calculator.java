package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private String mathExpression;

	public Calculator(String mathExpression) {
		this.mathExpression = mathExpression;
	}

	public void calculate() {
		String[] srcMathExpression = mathExpression.split(" ");
		int num1 = Integer.parseInt(srcMathExpression[0]);
		int num2 = Integer.parseInt(srcMathExpression[2]);
		char operation = srcMathExpression[1].charAt(0);
		switch (operation) {
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
			case '%':
				System.out.println(num1 % num2);
				break;
			case '^':
				System.out.println((int) Math.pow(num1, num2));
				break;
			default:
				System.out.println("Неверный знак математической операции");	
		}
	}
}