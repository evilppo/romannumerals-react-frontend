package no.clave.eirik.trening.romannumerals.domain;

import org.springframework.stereotype.Service;

@Service
public class RomanNumeralService {

    public String convertDecimalToRomanNumeral(int decimal){

        return DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(decimal);
    }

    public int convertRomanNumeralToDecimal(String numeral){

        return RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral(numeral);
    }
}
