package dje.calculate.string.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import dje.calculate.string.StringCalculator;

public class StringCalculatorTests {
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	private int calculate(String s) {
		StringCalculator calc=new StringCalculator();
		return calc.add(s);
	}
	
	@Test
	public void testEmptyString() {
		assertEquals(0, calculate(""));
	}
	
	@Test
	public void testSingleNumber() {
		assertEquals(1,calculate("1"));
	}
	
	@Test
	public void testTwoNumbers() {
		assertEquals(3,calculate("1,2"));
	}
	
	@Test
	public void testUnknownAmount() {
		assertEquals(78,calculate("1,2,3,4,5,6,7,8,9,10,11,12"));
	}
	
	@Test
	public void testNewLineIsValid() {
		assertEquals(6,calculate("1,2\n,3"));
	}
	
	@Test
	public void testNegativeNumberThrowsException() {
		exception.expect(NumberFormatException.class);
		calculate("-1,2");
	}
	
	@Test
	public void numbersBiggerThan1000AreIgnored() {
		assertEquals(6,calculate("1,2,3,100001"));
	}

}
