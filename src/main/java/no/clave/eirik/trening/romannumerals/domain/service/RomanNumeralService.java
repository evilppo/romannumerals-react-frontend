package no.clave.eirik.trening.romannumerals.domain.service;

import no.clave.eirik.trening.romannumerals.domain.Number;
import org.springframework.stereotype.Service;

@Service
public class RomanNumeralService {

    private static final int HIGHEST_POSSIBLE_INPUT = 3000;
    private static final int LOWEST_POSSIBLE_INPUT = 1;

    public Number convertDecimal(Number number) throws IllegalArgumentException{

        verifyDecimalNumberInRange(number.decimal);

        String converted = DecimalToRomanNumeralsConverter.convert(number.decimal);

        return new Number (number.decimal, converted);
    }

    public Number convertRomanNumeral(Number number) throws IllegalArgumentException{

        verifyValidRomanNumeral(number.romanNumeral);

        int converted = RomanNumeralToDecimalConverter.convert(number.romanNumeral);

        return new Number(converted, number.romanNumeral);
    }

    private void verifyDecimalNumberInRange(int decimal) throws IllegalArgumentException{

        if(decimal < LOWEST_POSSIBLE_INPUT || HIGHEST_POSSIBLE_INPUT < decimal){
            throw new IllegalArgumentException("Decimal number out of bounds. Should be in range 1-3000");
        }
    }

    private void verifyValidRomanNumeral(String numeralIn) throws IllegalArgumentException{

        int converted = RomanNumeralToDecimalConverter.convert(numeralIn);
        String reConverted = DecimalToRomanNumeralsConverter.convert(converted);

        if(! numeralIn.equals(reConverted)){
            throw new IllegalArgumentException("Invalid roman numeral used");
        }
    }
}
