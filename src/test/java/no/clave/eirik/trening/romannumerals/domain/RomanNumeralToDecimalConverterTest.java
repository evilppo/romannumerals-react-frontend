package no.clave.eirik.trening.romannumerals.domain;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("MagicNumber")
public class RomanNumeralToDecimalConverterTest {


    @Test
    public void testConvertSimpleNumeral() {
        Assert.assertEquals(1, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("I"));
        Assert.assertEquals(2, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("II"));
        Assert.assertEquals(3, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("III"));
        Assert.assertEquals(4, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("IV"));
        Assert.assertEquals(5, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("V"));
        Assert.assertEquals(6, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("VI"));
        Assert.assertEquals(7, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("VII"));
        Assert.assertEquals(8, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("VIII"));
        Assert.assertEquals(9, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("IX"));
        Assert.assertEquals(10, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("X"));

    }

    @Test
    public void testConvert10s(){

        Assert.assertEquals(11, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XI"));
        Assert.assertEquals(13, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XIII"));
        Assert.assertEquals(16, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XVI"));
        Assert.assertEquals(18, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XVIII"));
        Assert.assertEquals(19, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XIX"));
        Assert.assertEquals(20, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XX"));
        Assert.assertEquals(21, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XXI"));
        Assert.assertEquals(25, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XXV"));
        Assert.assertEquals(29, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XXIX"));
        Assert.assertEquals(30, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XXX"));
        Assert.assertEquals(33, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XXXIII"));
        Assert.assertEquals(37, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XXXVII"));
        Assert.assertEquals(39, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XXXIX"));
        Assert.assertEquals(40, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XL"));
        Assert.assertEquals(44, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XLIV"));
        Assert.assertEquals(46, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XLVI"));
        Assert.assertEquals(50, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("L"));
        Assert.assertEquals(55, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("LV"));
        Assert.assertEquals(60, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("LX"));
        Assert.assertEquals(69, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("LXIX"));
        Assert.assertEquals(70, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("LXX"));
        Assert.assertEquals(74, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("LXXIV"));
        Assert.assertEquals(82, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("LXXXII"));
        Assert.assertEquals(88, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("LXXXVIII"));
        Assert.assertEquals(90, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XC"));
        Assert.assertEquals(91, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XCI"));
        Assert.assertEquals(99, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("XCIX"));

    }

    @Test
    public void  testConvert100s(){

        Assert.assertEquals(100, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("C"));
        Assert.assertEquals(134, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CXXXIV"));
        Assert.assertEquals(179, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CLXXIX"));
        Assert.assertEquals(200, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CC"));
        Assert.assertEquals(204, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCIV"));
        Assert.assertEquals(213, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCXIII"));
        Assert.assertEquals(238, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCXXXVIII"));
        Assert.assertEquals(256, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCLVI"));
        Assert.assertEquals(273, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCLXXIII"));
        Assert.assertEquals(298, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCXCVIII"));
        Assert.assertEquals(313, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCCXIII"));
        Assert.assertEquals(339, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCCXXXIX"));
        Assert.assertEquals(372, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCCLXXII"));
        Assert.assertEquals(381, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCCLXXXI"));
        Assert.assertEquals(399, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CCCXCIX"));
        Assert.assertEquals(400, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CD"));
        Assert.assertEquals(401, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CDI"));
        Assert.assertEquals(426, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CDXXVI"));
        Assert.assertEquals(441, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CDXLI"));
        Assert.assertEquals(454, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CDLIV"));
        Assert.assertEquals(473, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CDLXXIII"));
        Assert.assertEquals(488, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CDLXXXVIII"));
        Assert.assertEquals(499, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CDXCIX"));
        Assert.assertEquals(500, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("D"));
        Assert.assertEquals(557, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DLVII"));
        Assert.assertEquals(592, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DXCII"));
        Assert.assertEquals(600, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DC"));
        Assert.assertEquals(634, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCXXXIV"));
        Assert.assertEquals(679, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCLXXIX"));
        Assert.assertEquals(700, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCC"));
        Assert.assertEquals(702, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCCII"));
        Assert.assertEquals(710, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCCX"));
        Assert.assertEquals(759, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCCLIX"));
        Assert.assertEquals(789, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCCLXXXIX"));
        Assert.assertEquals(800, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCCC"));
        Assert.assertEquals(809, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCCCIX"));
        Assert.assertEquals(811, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCCCXI"));
        Assert.assertEquals(854, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCCCLIV"));
        Assert.assertEquals(888, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("DCCCLXXXVIII"));
        Assert.assertEquals(900, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CM"));
        Assert.assertEquals(901, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CMI"));
        Assert.assertEquals(946, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CMXLVI"));
        Assert.assertEquals(984, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CMLXXXIV"));
        Assert.assertEquals(999, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("CMXCIX"));
        Assert.assertEquals(1000, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("M"));

    }

    @Test
    public void testConvert1000s(){

        Assert.assertEquals(1001, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MI"));
        Assert.assertEquals(1125, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MCXXV"));
        Assert.assertEquals(1264, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MCCLXIV"));
        Assert.assertEquals(1389, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MCCCLXXXIX"));
        Assert.assertEquals(1527, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MDXXVII"));
        Assert.assertEquals(1754, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MDCCLIV"));
        Assert.assertEquals(1999, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MCMXCIX"));
        Assert.assertEquals(2000, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MM"));
        Assert.assertEquals(2089, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MMLXXXIX"));
        Assert.assertEquals(2371, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MMCCCLXXI"));
        Assert.assertEquals(2610, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MMDCX"));
        Assert.assertEquals(2888, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MMDCCCLXXXVIII"));
        Assert.assertEquals(2999, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MMCMXCIX"));
        Assert.assertEquals(3000, RomanNumeralToDecimalConverter.convertDecimalToRomanNumeral("MMM"));
    }

}