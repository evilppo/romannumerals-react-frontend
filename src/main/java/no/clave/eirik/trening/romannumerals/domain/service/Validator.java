package no.clave.eirik.trening.romannumerals.domain.service;

import no.clave.eirik.trening.romannumerals.domain.Number;
import no.clave.eirik.trening.romannumerals.domain.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class Validator {

    static final int HIGHEST_POSSIBLE_INPUT = 3000;
    private static final int LOWEST_POSSIBLE_INPUT = 1;

    static final String validationMsgDecimalOutOfRange = "Input decimal is out of range. Should be in range 1-3000";
    static final String validationMsgInvalidRomanNumeral = "Input roman numeral is invalid";

    private RomanNumeralToDecimalConverter romanNumeralToDecimalConverter;
    private DecimalToRomanNumeralsConverter decimalToRomanNumeralsConverter;

    @Autowired
    Validator(RomanNumeralToDecimalConverter romanNumeralToDecimalConverter,
              DecimalToRomanNumeralsConverter decimalToRomanNumeralsConverter) {
        this.romanNumeralToDecimalConverter = romanNumeralToDecimalConverter;
        this.decimalToRomanNumeralsConverter = decimalToRomanNumeralsConverter;
    }


    Validation decimal(Number number){

        if(number.decimal < LOWEST_POSSIBLE_INPUT || HIGHEST_POSSIBLE_INPUT < number.decimal){

            return new Validation(Validation.Status.VALIDATION_FAILED, validationMsgDecimalOutOfRange);
        }

        else return new Validation(Validation.Status.OK, null);
    }


     Validation romanNumeral(Number number){

        if(!validNumeral(number.romanNumeral) || !number.hasRomanNumeral()){

            return new Validation(Validation.Status.VALIDATION_FAILED, validationMsgInvalidRomanNumeral);
        }

        else return new Validation(Validation.Status.OK, null);
    }

    private boolean validNumeral(String numeral){

         //Method verifies if 'numeral' is a valid Roman Numeral//

        int converted = romanNumeralToDecimalConverter.convert(numeral);
        String reConverted = decimalToRomanNumeralsConverter.convert(converted);

        return numeral.equals(reConverted);
    }
}