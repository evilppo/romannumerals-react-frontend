package no.clave.eirik.trening.romannumerals.domain.service;

import no.clave.eirik.trening.romannumerals.domain.Number;
import org.springframework.stereotype.Service;

@Service
public class RomanNumeralService {

    public Number convertDecimal(Number number){

        String converted = DecimalToRomanNumeralsConverter.convert(number.decimal);

        return new Number (number.decimal, converted);
    }

    public Number convertRomanNumeral(Number number){

        int converted = RomanNumeralToDecimalConverter.convert(number.romanNumeral);

        return new Number(converted, number.romanNumeral);
    }
}
