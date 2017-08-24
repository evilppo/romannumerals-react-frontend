package no.clave.eirik.trening.romannumerals.domain.service;

import no.clave.eirik.trening.romannumerals.domain.ConversionRequest;
import no.clave.eirik.trening.romannumerals.domain.Number;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RomanNumeralService {

    private static final int HIGHEST_POSSIBLE_INPUT = 3000;
    private static final int LOWEST_POSSIBLE_INPUT = 1;

    public ConversionRequest convertDecimal(Number number){

        ConversionRequest conversionRequest = new ConversionRequest(number);

        verifyConversionRequestDecimal(conversionRequest);

        conversionRequest.setNumber(new Number(number.decimal, DecimalToRomanNumeralsConverter.convert(number.decimal)));

        return conversionRequest;
    }

    public ConversionRequest convertRomanNumeral(Number number){

        ConversionRequest conversionRequest = new ConversionRequest((number));

        verifyConversionRequestRomanNumeral(conversionRequest);

        conversionRequest.setNumber(new Number(RomanNumeralToDecimalConverter.convert(number.romanNumeral), number.romanNumeral));

        return conversionRequest;
    }

    private void verifyConversionRequestDecimal(ConversionRequest conversionRequest){

        if(conversionRequest.getNumber().decimal < LOWEST_POSSIBLE_INPUT || HIGHEST_POSSIBLE_INPUT < conversionRequest.getNumber().decimal){

            conversionRequest.setStatus("Validation failed");
            conversionRequest.setValidationMsg("Decimal number out of range. Should be in range 1-3000");
        }
    }

    private void verifyConversionRequestRomanNumeral(ConversionRequest conversionRequest){

        int converted = RomanNumeralToDecimalConverter.convert(conversionRequest.getNumber().romanNumeral);
        String reConverted = DecimalToRomanNumeralsConverter.convert(converted);

        if(!Objects.equals(conversionRequest.getNumber().romanNumeral, reConverted) || !conversionRequest.getNumber().hasRomanNumeral()){

            conversionRequest.setStatus("Validation failed");
            conversionRequest.setValidationMsg("Invalid roman numeral sent as input");
        }
    }
}