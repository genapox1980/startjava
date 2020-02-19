package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String continuation;

		do {
			System.out.print("Введите математическое выражение: ");
			String mathExpression = scan.nextLine();
			String[] split = mathExpression.split(" ");
			int num1 = Integer.parseInt(split[0]);
			int num2 = Integer.parseInt(split[2]);
			char operation = split[1].charAt(0);
			System.out.println(calc.calculate(num1, num2, operation));
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				continuation = scan.next();
			} while (!continuation.equals("нет") && !continuation.equals("да"));	 
		} while (continuation.equals("да"));
	}
}