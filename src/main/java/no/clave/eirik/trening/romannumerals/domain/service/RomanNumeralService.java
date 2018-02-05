package no.clave.eirik.trening.romannumerals.domain.service;

import no.clave.eirik.trening.romannumerals.domain.ConversionResponse;
import no.clave.eirik.trening.romannumerals.domain.Number;
import no.clave.eirik.trening.romannumerals.domain.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RomanNumeralService {

    private Validator validator;
    private DecimalToRomanNumeralsConverter decimalToRomanNumeralsConverter;
    private RomanNumeralToDecimalConverter romanNumeralToDecimalConverter;

    @Autowired
    public RomanNumeralService(Validator validator,
                               DecimalToRomanNumeralsConverter decimalToRomanNumeralsConverter,
                               RomanNumeralToDecimalConverter romanNumeralToDecimalConverter) {

        this.validator = validator;
        this.decimalToRomanNumeralsConverter = decimalToRomanNumeralsConverter;
        this.romanNumeralToDecimalConverter = romanNumeralToDecimalConverter;
    }


    public ConversionResponse convertDecimal(Number number){

        Validation validation = validator.decimal(number);

        if(validation.isValid()) {
            String converted = decimalToRomanNumeralsConverter.convert(number.decimal);
            return new ConversionResponse(new Number(number.decimal, converted), validation);
        }

        return new ConversionResponse(number, validation);
    }

    public ConversionResponse convertRomanNumeral(Number number){

        Validation validation = validator.romanNumeral(number);

        if(validation.isValid()) {
            int converted = romanNumeralToDecimalConverter.convert(number.romanNumeral);
            return new ConversionResponse(new Number(converted, number.romanNumeral), validation);
        }
        return new ConversionResponse(number, validation);
    }
}