package no.clave.eirik.trening.romannumerals.domain;

 class DecimalToRomanNumeralsConverter {

	private static final int THOUSANDS = 0;
	private static final int HUNDREDS = 1;
	private static final int TENS = 2;
	private static final int SINGLES = 3;


	static String convertDecimalToRomanNumeral(int i){

		int[] decomposedDecimalNumber = decomposeDecimalNumber(i);

		return generateRomanNumeral(decomposedDecimalNumber);
	}


	private static int[] decomposeDecimalNumber(int i){
		//Decompose decimal number into array using integer division//

		int[] decomposedDecimalNumber = new int[4];

		int thousands = (i / 1000);
		decomposedDecimalNumber[THOUSANDS] = thousands;
		i = i - thousands*1000;

		int hundreds = (i / 100);
		decomposedDecimalNumber[HUNDREDS] = hundreds;
		i = i - hundreds*100;

		int tens = (i / 10);
		decomposedDecimalNumber[TENS] = tens;
		i = i - tens*10;

		//rest//
		decomposedDecimalNumber[SINGLES] = i;

		return decomposedDecimalNumber;
	}

	private static String generateRomanNumeral(int[] decomposedDecimalNumber){

		String romanNumeral = "";

		if(decomposedDecimalNumber[THOUSANDS] != 0){romanNumeral = romanNumeral.concat(convert1000s(decomposedDecimalNumber[THOUSANDS]));}
		if(decomposedDecimalNumber[HUNDREDS] != 0){romanNumeral = romanNumeral.concat(convert100s(decomposedDecimalNumber[HUNDREDS]));}
		if(decomposedDecimalNumber[TENS] != 0){romanNumeral = romanNumeral.concat(convert10s(decomposedDecimalNumber[TENS]));}
		if(decomposedDecimalNumber[SINGLES] != 0){romanNumeral = romanNumeral.concat(convertSimpleNumber(decomposedDecimalNumber[SINGLES]));}

		return romanNumeral;
	}

	//1-9//
	private static String convertSimpleNumber(int i) {
		if (i == 1) {
			return "I";
		} else if (i == 2) {
			return "II";
		} else if (i == 3) {
			return "III";
		} else if (i == 4) {
			return "IV";
		} else if (i == 5) {
			return "V";
		} else if (i == 6) {
			return "VI";
		} else if (i == 7) {
			return "VII";
		} else if (i == 8) {
			return "VIII";
		} else{
			return "IX";
		}
	}

	//10-90//
	private static String convert10s(int i) {
		if (i == 1) {
			return "X";
		} else if (i == 2) {
			return "XX";
		} else if (i == 3) {
			return "XXX";
		} else if (i == 4) {
			return "XL";
		} else if (i == 5) {
			return "L";
		} else if (i == 6) {
			return "LX";
		} else if (i == 7) {
			return "LXX";
		} else if (i == 8) {
			return "LXXX";
		} else{
			return "XC";
		}
	}

	//100-900//
	private static String convert100s(int i) {
		if (i == 1) {
			return "C";
		} else if (i == 2) {
			return "CC";
		} else if (i == 3) {
			return "CCC";
		} else if (i == 4) {
			return "CD";
		} else if (i == 5) {
			return "D";
		} else if (i == 6) {
			return "DC";
		} else if (i == 7) {
			return "DCC";
		} else if (i == 8) {
			return "DCCC";
		} else{
			return "CM";
		}
	}

	//1000-3000//
	private static String convert1000s(int i) {
		if (i == 1) {
			return "M";
		} else if (i == 2) {
			return "MM";
		} else {
			return "MMM";
		}
	}
}
