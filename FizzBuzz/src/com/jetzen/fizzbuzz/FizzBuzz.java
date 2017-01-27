package com.jetzen.fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		FizzBuzz buzzer=new FizzBuzz();
		for(int i=1;i<=100;i++){
			System.out.println(buzzer.getTranslation(i));
		}
	}
	
	public String getTranslation(int i) {
		if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		} else if (i % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(i);
		}
	}

}
