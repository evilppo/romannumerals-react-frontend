package no.clave.eirik.trening.romannumerals;

class DecimalToRomanNumeralsConverter {

	private static final int WHOLE_THOUSANDS = 0;

	static String convertDecimalToRomanNumeral(int i){

		int[] decomposedDecimalNumber = decomposeDecimalNumber(i);

		return generateRomanNumeral(decomposedDecimalNumber);
	}


	private static int[] decomposeDecimalNumber(int i){

		//Decompose decimal number into array using integer division//

		int[] decomposedDecimalNumber = new int[4];

		int thousands = (i / 1000);
		decomposedDecimalNumber[0] = thousands;
		i = i - thousands*1000;

		int hundreds = (i / 100);
		decomposedDecimalNumber[1] = hundreds;
		i = i - hundreds*100;

		int tens = (i / 10);
		decomposedDecimalNumber[2] = tens;
		i = i - tens*10;

		//rest//
		decomposedDecimalNumber[3] = i;

		return decomposedDecimalNumber;
	}

	private static String generateRomanNumeral(int[] decomposedDecimalNumber){

		String romanNumeral = "";

		if(decomposedDecimalNumber[WHOLE_THOUSANDS] != 0){romanNumeral = romanNumeral.concat(convert1000s(decomposedDecimalNumber[0]));}
		if(decomposedDecimalNumber[1] != 0){romanNumeral = romanNumeral.concat(convert100s(decomposedDecimalNumber[1]));}
		if(decomposedDecimalNumber[2] != 0){romanNumeral = romanNumeral.concat(convert10s(decomposedDecimalNumber[2]));}
		if(decomposedDecimalNumber[3] != 0){romanNumeral = romanNumeral.concat(convertSimpleNumber(decomposedDecimalNumber[3]));}

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

/*
	//"Stupid" implementation. EG: Does not use 'IV', but rather: 'IIII'//

	private static int[] base = {100, 50, 10, 5, 1};
	private static String[] baseRoman = {"C", "L", "X", "V","I"};


	public static String convertLargeNumberStupid(int i) {


		int[] digitCounter = new int[base.length];

		for (int j = 0; j < base.length; j++) {
			while (i >= base[j]) {
				i = i - base[j];
				digitCounter[j]++;
			}
		}

		return generateRomanNumberStupid(digitCounter);
	}

	private static String generateRomanNumberStupid(int[] digitCounter){

		String result = "";

		for (int m = 0; m < base.length; m++) {
			for(int k = 0; k < digitCounter[m]; k++){

				result = result.concat(baseRoman[m]);
			}
		}

		return result;
	}*/
}
