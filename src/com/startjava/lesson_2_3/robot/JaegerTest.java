package com.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 3, 10, 10);
		
		System.out.println(jaegerOne.getModelName());
		System.out.println(jaegerOne.getMark());
		System.out.println(jaegerOne.getOrigin());
		System.out.println(jaegerOne.getHeight());
		System.out.println(jaegerOne.getWeight());
		System.out.println(jaegerOne.getSpeed());
		System.out.println(jaegerOne.getStrenght());
		System.out.println(jaegerOne.getArmor());
		
		Jaeger jaegerTwo = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 3.312f, 5, 7, 4);
	
		System.out.println(jaegerTwo.getModelName());
		System.out.println(jaegerTwo.getMark());
		System.out.println(jaegerTwo.getOrigin());
		System.out.println(jaegerTwo.getHeight());
		System.out.println(jaegerTwo.getWeight());
		System.out.println(jaegerTwo.getSpeed());
		System.out.println(jaegerTwo.getStrenght());
		System.out.println(jaegerTwo.getArmor());
	}
}