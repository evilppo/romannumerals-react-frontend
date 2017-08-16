package no.clave.eirik.trening.romannumerals;

class RomanNumeralToDecimalConverter {

    static int convert(String numeral){

        int result = 0;
        int length = numeral.length();

        for (int i = 0; i < length; i++){

            char digit = numeral.charAt(i);
            int digitValue = charValues(digit);

            if(i < length - 1){

                char digitAfter = numeral.charAt(i + 1);
                int digitAfterValue = charValues(digitAfter);
                if (digitValue < digitAfterValue){digitValue = -(digitValue);}
            }

            result += digitValue;
        }

        return result;
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



    /*    public static int convertSimpleNumeral(String numeral){

        if (numeral.equals("I")){return 1;}
        else if(numeral.equals("II")){return 2;}
        else if(numeral.equals("III")){return 3;}
        else if(numeral.equals("IV")){return 4;}
        else if(numeral.equals("V")){return 5;}
        else if(numeral.equals("VI")){return 6;}
        else if(numeral.equals("VII")){return 7;}
        else if(numeral.equals("VIII")){return 8;}
        else if(numeral.equals("IX")){return 9;}
        else{return 10;}

    }*/

}
