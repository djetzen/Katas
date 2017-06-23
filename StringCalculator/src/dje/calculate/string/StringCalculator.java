package dje.calculate.string;

public class StringCalculator {

	public int add(String string) {
		if (string.equals(""))
			return 0;
		int sum = 0;
		String exceptionMessage = "";
		for (String s : string.replace("\n", "").split(",")) {
			int parsedNumber = Integer.parseInt(s);
			if (parsedNumber < 0) {
				exceptionMessage += parsedNumber + ",";
			}
			else if(parsedNumber<1000) {
				sum += parsedNumber;
			}
		}
		if(!exceptionMessage.equals("")) {
			throw new NumberFormatException("no negatives allowed, negatives are: "+exceptionMessage);
		}
		else {
			return sum;
		}
	}

}
