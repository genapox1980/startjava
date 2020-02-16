package com.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String continuation;

		do {
			System.out.print("Введите первое число: ");
			int num1 = scan.nextInt();
			System.out.print("Введите знак математической операции: ");
			char operation = scan.next().charAt(0);
			System.out.print("Введите второе число: ");
			int num2 = scan.nextInt();
			System.out.println(calc.calculate(num1, num2, operation));
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				continuation = scan.next();
			} while (!continuation.equals("нет") && !continuation.equals("да"));	 
		} while (continuation.equals("да"));	
	}
}