package no.clave.eirik.trening.romannumerals.domain.service;

import no.clave.eirik.trening.romannumerals.domain.Number;
import no.clave.eirik.trening.romannumerals.domain.Validation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ValidatorTest {


    private Validator validator;

    @Before
    public void setUp() throws Exception {
        RomanNumeralToDecimalConverter rConverter = new RomanNumeralToDecimalConverter();
        DecimalToRomanNumeralsConverter dConverter = new DecimalToRomanNumeralsConverter();
        validator = new Validator(rConverter, dConverter);
    }

    @Test
    public void validDecimalTest() throws Exception {

        Number n = new Number(1, null);
        Validation v = validator.decimal(n);

        assertEquals(Validation.Status.OK, v.getStatus());
        assertNull(v.getValidationMsg());
    }

    @Test
    public void decimalZeroTest() throws Exception {

        Number n = new Number(0, null);
        Validation v = validator.decimal(n);

        assertEquals(Validation.Status.VALIDATION_FAILED, v.getStatus());
        assertEquals(Validator.validationMsgDecimalOutOfRange, v.getValidationMsg());
    }

    @Test
    public void decimalNullTest() throws Exception {

        Number n = new Number(null, null);
        Validation v = validator.decimal(n);

        assertEquals(Validation.Status.VALIDATION_FAILED, v.getStatus());
        assertEquals(Validator.validationMsgInputIsEmpty, v.getValidationMsg());
    }

    @Test
    public void decimalNegativeTest() throws Exception {

        Number n = new Number(-1, null);
        Validation v = validator.decimal(n);

        assertEquals(Validation.Status.VALIDATION_FAILED, v.getStatus());
        assertEquals(Validator.validationMsgDecimalOutOfRange, v.getValidationMsg());
    }

    @Test
    public void decimalOuterBoundsTest() throws Exception {

        Number n = new Number(Validator.HIGHEST_POSSIBLE_INPUT + 1, null);
        Validation v = validator.decimal(n);

        assertEquals(Validation.Status.VALIDATION_FAILED, v.getStatus());
        assertEquals(Validator.validationMsgDecimalOutOfRange, v.getValidationMsg());
    }

    @Test
    public void validRomanNumeralTest() throws Exception {

        Number n = new Number(0, "I");
        Validation v = validator.romanNumeral(n);

        assertEquals(Validation.Status.OK, v.getStatus());
        assertNull(v.getValidationMsg());
    }

    @Test
    public void romanNumeralEmptyTest() throws Exception {

        Number n = new Number(0, "");
        Validation v = validator.romanNumeral(n);

        assertEquals(Validation.Status.VALIDATION_FAILED, v.getStatus());
        assertEquals(Validator.validationMsgInputIsEmpty, v.getValidationMsg());
    }

    @Test
    public void romanNumeralNullTest() throws Exception {

        Number n = new Number(null, null);
        Validation v = validator.romanNumeral(n);

        assertEquals(Validation.Status.VALIDATION_FAILED, v.getStatus());
        assertEquals(Validator.validationMsgInputIsEmpty, v.getValidationMsg());
    }

    @Test
    public void romanNumeralInvalidTest() throws Exception {

        Number n = new Number(0, "Invalid Roman Numeral");
        Validation v = validator.romanNumeral(n);

        assertEquals(Validation.Status.VALIDATION_FAILED, v.getStatus());
        assertEquals(Validator.validationMsgInvalidRomanNumeral, v.getValidationMsg());
    }
}