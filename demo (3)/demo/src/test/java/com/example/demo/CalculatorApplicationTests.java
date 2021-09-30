package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CalculatorApplicationTests {

	CalculatorApplication underTest = new CalculatorApplication();

	@Disabled("Disabled for module.")
	@Test
	void itShouldAddTwoNumbers() {
		// given
		double numberOne = 20;
		double numberTwo = 30;

		//when
		double result = underTest.add(numberOne, numberTwo);

		//then
		double expected = 50;
		assertThat(result).isEqualTo(expected);

	}

		@Test
	void itShouldSubtractTwoNumbers() {
		// given
		double numberOne = 30;
		double numberTwo = 20;

		//when
		double result = underTest.subtract(numberOne, numberTwo);

		//then
		double expected = 10;
		assertThat(result).isEqualTo(expected);
	}

	@Test
	void itShouldAddMultiplyNumbers() {
		// given
		double numberOne = 20;
		double numberTwo = 30;

		//when
		double result = underTest.multiply(numberOne, numberTwo);

		//then
		double expected = 600;
		assertThat(result).isEqualTo(expected);

	}

	@Test
	void itShouldDivideTwoNumbers() {
		// given
		double numberOne = 600;
		double numberTwo = 30;

		//when
		double result = underTest.divide(numberOne, numberTwo);

		//then
		double expectation = 20;
		assertThat(result).isEqualTo(expectation);

	}

	@Test
	void itShouldThrowArithmeticExcep() {
		// given
		double numberOne = 600;
		double numberTwo = 0;

		//Testing for correct thrown exception.

		//then
		Assertions.assertThrows(ArithmeticException.class, () ->
				underTest.divide(numberOne, numberTwo));
	}


}
