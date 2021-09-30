package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
	double add(double a, double b) {
		return a + b;
	}

	double subtract(double a, double b) {
		return a - b;
	}

	double multiply(double a, double b) {
		return a * b;
	}

	double divide(double a, double b) {
		if(b == 0.0) {
			throw new ArithmeticException();
		}
		else {
			return a / b;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		CalculatorApplication calculatorApplication = new CalculatorApplication();

		double numberOne = 60;
		double numberTwo = 1;

		double result = calculatorApplication.divide(numberOne, numberTwo);
		System.out.println(result);

	}

}
