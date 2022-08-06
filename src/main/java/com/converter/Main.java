package com.converter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		Scanner scan = new Scanner(System.in);
		float ans;
		float ans1;
		float ans2;
		float ans3;
		int answer;

		System.out.println("Enter the value you want to convert: ");
		ans = scan.nextFloat();
		System.out.println("1. Convert Fahrenheit to Celsius \n" +
				"2. Convert Celsius to Fahrenheit");
		answer = scan.nextInt();

		if (answer == 1) {
		ans2 = (float) (ans-32);
		ans3 = (float) (ans2*(5)/9);

		System.out.println(ans + " Fahrenheit is " + ans3 + " Celsius");
		}
		if (answer == 2) {
			ans1 = (float) ((ans*(1.8))+32);
			System.out.println(ans + " Celsius is " + ans1 + " Fahrenheit");
		}

	}
}
