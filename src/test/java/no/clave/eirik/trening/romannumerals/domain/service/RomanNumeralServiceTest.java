package no.clave.eirik.trening.romannumerals.domain.service;

import no.clave.eirik.trening.romannumerals.domain.ConversionRequest;
import no.clave.eirik.trening.romannumerals.domain.Number;
import org.junit.Assert;
import org.junit.Test;


public class RomanNumeralServiceTest {

    RomanNumeralService rns = new RomanNumeralService();

    @Test
    public void convertDecimalTest() throws Exception {

        Number n  = new Number(1, "");
        ConversionRequest cr = rns.convertDecimal(n);

        Assert.assertEquals("OK", cr.getStatus());
        Assert.assertEquals("OK", cr.getValidationMsg());
        Assert.assertEquals(1, cr.getNumber().decimal);
        Assert.assertEquals("I", cr.getNumber().romanNumeral);


        Number n2 = new Number(0, "");
        ConversionRequest cr2 = rns.convertDecimal(n2);

        Assert.assertEquals("Validation failed", cr2.getStatus());
        Assert.assertEquals("Decimal number out of range. Should be in range 1-3000", cr2.getValidationMsg());
        Assert.assertEquals(0, cr2.getNumber().decimal);
        Assert.assertEquals(null, cr2.getNumber().romanNumeral);


        Number n3 = new Number(-1, "");
        ConversionRequest cr3 = rns.convertDecimal(n3);

        Assert.assertEquals("Validation failed", cr3.getStatus());
        Assert.assertEquals("Decimal number out of range. Should be in range 1-3000", cr3.getValidationMsg());
        Assert.assertEquals(-1, cr3.getNumber().decimal);
        Assert.assertEquals(null, cr3.getNumber().romanNumeral);


        Number n4 = new Number(3001, "");
        ConversionRequest cr4 = rns.convertDecimal(n4);

        Assert.assertEquals("Validation failed", cr4.getStatus());
        Assert.assertEquals("Decimal number out of range. Should be in range 1-3000", cr4.getValidationMsg());
        Assert.assertEquals(3001, cr4.getNumber().decimal);
        Assert.assertEquals(null, cr4.getNumber().romanNumeral);
    }



    @Test
    public void convertRomanNumeral() throws Exception {

        Number n = new Number(0, "I");
        ConversionRequest cr = rns.convertRomanNumeral(n);

        Assert.assertEquals("OK", cr.getStatus());
        Assert.assertEquals("OK", cr.getValidationMsg());
        Assert.assertEquals("I", cr.getNumber().romanNumeral);
        Assert.assertEquals(1, cr.getNumber().decimal);


        Number n2 = new Number(0, "");
        ConversionRequest cr2 = rns.convertRomanNumeral(n2);

        Assert.assertEquals("Validation failed", cr2.getStatus());
        Assert.assertEquals("Invalid roman numeral sent as input", cr2.getValidationMsg());
        Assert.assertEquals("", cr2.getNumber().romanNumeral);
        Assert.assertEquals(null, cr2.getNumber().decimal);


        Number n3 = new Number(0, "A");
        ConversionRequest cr3 = rns.convertRomanNumeral(n3);

        Assert.assertEquals("Validation failed", cr3.getStatus());
        Assert.assertEquals("Invalid roman numeral sent as input", cr3.getValidationMsg());
        Assert.assertEquals("A", cr3.getNumber().romanNumeral);
        Assert.assertEquals(null, cr3.getNumber().decimal);
    }
}