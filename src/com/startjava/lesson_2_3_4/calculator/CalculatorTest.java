package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String continuation;

		do {
			System.out.print("Введите математическое выражение: ");
			String mathExpression = scan.nextLine();
			Calculator calc = new Calculator(mathExpression);
			calc.calculate();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				continuation = scan.nextLine();
			} while (!continuation.equals("нет") && !continuation.equals("да"));	 
		} while (continuation.equals("да"));
	}
}