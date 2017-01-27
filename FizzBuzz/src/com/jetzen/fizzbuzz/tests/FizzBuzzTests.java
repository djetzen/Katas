package com.jetzen.fizzbuzz.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.jetzen.fizzbuzz.FizzBuzz;

public class FizzBuzzTests {
	
	private FizzBuzz buzzer;

	@Before
	public void initialize(){
		buzzer=new FizzBuzz();
	}
	
	@Test
	public void testNumberNotDividableBy3And5ReturnsNumber(){
		assertEquals("1",buzzer.getTranslation(1));
	}

	@Test
	public void testNumberDividableBy3ReturnsFizz(){
		assertEquals("Fizz",buzzer.getTranslation(3));
	}
	
	@Test
	public void testNumberDividableBy5ReturnsFizz(){
		assertEquals("Buzz", buzzer.getTranslation(5));
	}
	
	@Test
	public void testNumberDividableBy5And3ReturnsFizzBuzz(){
		assertEquals("FizzBuzz", buzzer.getTranslation(15));
	}
}
