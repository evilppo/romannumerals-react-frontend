package no.clave.eirik.trening.romannumerals.domain.service;


 @SuppressWarnings("MagicNumber")
 class RomanNumeralToDecimalConverter {

     static int convert(String numeral){

        int result = 0;
        int length = numeral.length();

        for (int i = 0; i < length; i++){
            result += getDigitValue(numeral, length, i);
        }

        return result;
    }

    private static int getDigitValue(String numeral, int length, int i) {
        char digit = numeral.charAt(i);
        int digitValue = charValues(digit);

        boolean notLastNumber = i < length - 1;
        if (notLastNumber && shouldNegate(digitValue, numeral, i)) {
            digitValue = -(digitValue);
        }
        return digitValue;
    }

    private static boolean shouldNegate(int digitValue, String numeral, int i) {
        char digitAfter = numeral.charAt(i + 1);
        int digitAfterValue = charValues(digitAfter);
        return digitValue < digitAfterValue;
    }

    private static int charValues(char digit){

        if(digit == 'I'){return 1;}
        else if (digit == 'V'){return 5;}
        else if(digit == 'X'){return 10;}
        else if(digit == 'L'){return 50;}
        else if(digit == 'C'){return 100;}
        else if(digit == 'D'){return 500;}
        else {return 1000;}
    }
}