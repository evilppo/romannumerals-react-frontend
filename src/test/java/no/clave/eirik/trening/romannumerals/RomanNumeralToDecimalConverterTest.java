package no.clave.eirik.trening.romannumerals;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralToDecimalConverterTest {


    @Test
    public void testConvertSimpleNumeral() {
        Assert.assertEquals(1, RomanNumeralToDecimalConverter.convert("I"));
        Assert.assertEquals(2, RomanNumeralToDecimalConverter.convert("II"));
        Assert.assertEquals(3, RomanNumeralToDecimalConverter.convert("III"));
        Assert.assertEquals(4, RomanNumeralToDecimalConverter.convert("IV"));
        Assert.assertEquals(5, RomanNumeralToDecimalConverter.convert("V"));
        Assert.assertEquals(6, RomanNumeralToDecimalConverter.convert("VI"));
        Assert.assertEquals(7, RomanNumeralToDecimalConverter.convert("VII"));
        Assert.assertEquals(8, RomanNumeralToDecimalConverter.convert("VIII"));
        Assert.assertEquals(9, RomanNumeralToDecimalConverter.convert("IX"));
        Assert.assertEquals(10, RomanNumeralToDecimalConverter.convert("X"));

    }

    @Test
    public void testConvert10s(){

        Assert.assertEquals(11, RomanNumeralToDecimalConverter.convert("XI"));
        Assert.assertEquals(13, RomanNumeralToDecimalConverter.convert("XIII"));
        Assert.assertEquals(16, RomanNumeralToDecimalConverter.convert("XVI"));
        Assert.assertEquals(18, RomanNumeralToDecimalConverter.convert("XVIII"));
        Assert.assertEquals(19, RomanNumeralToDecimalConverter.convert("XIX"));
        Assert.assertEquals(20, RomanNumeralToDecimalConverter.convert("XX"));
        Assert.assertEquals(21, RomanNumeralToDecimalConverter.convert("XXI"));
        Assert.assertEquals(25, RomanNumeralToDecimalConverter.convert("XXV"));
        Assert.assertEquals(29, RomanNumeralToDecimalConverter.convert("XXIX"));
        Assert.assertEquals(30, RomanNumeralToDecimalConverter.convert("XXX"));
        Assert.assertEquals(33, RomanNumeralToDecimalConverter.convert("XXXIII"));
        Assert.assertEquals(37, RomanNumeralToDecimalConverter.convert("XXXVII"));
        Assert.assertEquals(39, RomanNumeralToDecimalConverter.convert("XXXIX"));
        Assert.assertEquals(40, RomanNumeralToDecimalConverter.convert("XL"));
        Assert.assertEquals(44, RomanNumeralToDecimalConverter.convert("XLIV"));
        Assert.assertEquals(46, RomanNumeralToDecimalConverter.convert("XLVI"));
        Assert.assertEquals(50, RomanNumeralToDecimalConverter.convert("L"));
        Assert.assertEquals(55, RomanNumeralToDecimalConverter.convert("LV"));
        Assert.assertEquals(60, RomanNumeralToDecimalConverter.convert("LX"));
        Assert.assertEquals(69, RomanNumeralToDecimalConverter.convert("LXIX"));
        Assert.assertEquals(70, RomanNumeralToDecimalConverter.convert("LXX"));
        Assert.assertEquals(74, RomanNumeralToDecimalConverter.convert("LXXIV"));
        Assert.assertEquals(82, RomanNumeralToDecimalConverter.convert("LXXXII"));
        Assert.assertEquals(88, RomanNumeralToDecimalConverter.convert("LXXXVIII"));
        Assert.assertEquals(90, RomanNumeralToDecimalConverter.convert("XC"));
        Assert.assertEquals(91, RomanNumeralToDecimalConverter.convert("XCI"));
        Assert.assertEquals(99, RomanNumeralToDecimalConverter.convert("XCIX"));

    }

    @Test
    public void  testConvert100s(){

        Assert.assertEquals(100, RomanNumeralToDecimalConverter.convert("C"));
        Assert.assertEquals(134, RomanNumeralToDecimalConverter.convert("CXXXIV"));
        Assert.assertEquals(179, RomanNumeralToDecimalConverter.convert("CLXXIX"));
        Assert.assertEquals(200, RomanNumeralToDecimalConverter.convert("CC"));
        Assert.assertEquals(204, RomanNumeralToDecimalConverter.convert("CCIV"));
        Assert.assertEquals(213, RomanNumeralToDecimalConverter.convert("CCXIII"));
        Assert.assertEquals(238, RomanNumeralToDecimalConverter.convert("CCXXXVIII"));
        Assert.assertEquals(256, RomanNumeralToDecimalConverter.convert("CCLVI"));
        Assert.assertEquals(273, RomanNumeralToDecimalConverter.convert("CCLXXIII"));
        Assert.assertEquals(298, RomanNumeralToDecimalConverter.convert("CCXCVIII"));
        Assert.assertEquals(313, RomanNumeralToDecimalConverter.convert("CCCXIII"));
        Assert.assertEquals(339, RomanNumeralToDecimalConverter.convert("CCCXXXIX"));
        Assert.assertEquals(372, RomanNumeralToDecimalConverter.convert("CCCLXXII"));
        Assert.assertEquals(381, RomanNumeralToDecimalConverter.convert("CCCLXXXI"));
        Assert.assertEquals(399, RomanNumeralToDecimalConverter.convert("CCCXCIX"));
        Assert.assertEquals(400, RomanNumeralToDecimalConverter.convert("CD"));
        Assert.assertEquals(401, RomanNumeralToDecimalConverter.convert("CDI"));
        Assert.assertEquals(426, RomanNumeralToDecimalConverter.convert("CDXXVI"));
        Assert.assertEquals(441, RomanNumeralToDecimalConverter.convert("CDXLI"));
        Assert.assertEquals(454, RomanNumeralToDecimalConverter.convert("CDLIV"));
        Assert.assertEquals(473, RomanNumeralToDecimalConverter.convert("CDLXXIII"));
        Assert.assertEquals(488, RomanNumeralToDecimalConverter.convert("CDLXXXVIII"));
        Assert.assertEquals(499, RomanNumeralToDecimalConverter.convert("CDXCIX"));
        Assert.assertEquals(500, RomanNumeralToDecimalConverter.convert("D"));
        Assert.assertEquals(557, RomanNumeralToDecimalConverter.convert("DLVII"));
        Assert.assertEquals(592, RomanNumeralToDecimalConverter.convert("DXCII"));
        Assert.assertEquals(600, RomanNumeralToDecimalConverter.convert("DC"));
        Assert.assertEquals(634, RomanNumeralToDecimalConverter.convert("DCXXXIV"));
        Assert.assertEquals(679, RomanNumeralToDecimalConverter.convert("DCLXXIX"));
        Assert.assertEquals(700, RomanNumeralToDecimalConverter.convert("DCC"));
        Assert.assertEquals(702, RomanNumeralToDecimalConverter.convert("DCCII"));
        Assert.assertEquals(710, RomanNumeralToDecimalConverter.convert("DCCX"));
        Assert.assertEquals(759, RomanNumeralToDecimalConverter.convert("DCCLIX"));
        Assert.assertEquals(789, RomanNumeralToDecimalConverter.convert("DCCLXXXIX"));
        Assert.assertEquals(800, RomanNumeralToDecimalConverter.convert("DCCC"));
        Assert.assertEquals(809, RomanNumeralToDecimalConverter.convert("DCCCIX"));
        Assert.assertEquals(811, RomanNumeralToDecimalConverter.convert("DCCCXI"));
        Assert.assertEquals(854, RomanNumeralToDecimalConverter.convert("DCCCLIV"));
        Assert.assertEquals(888, RomanNumeralToDecimalConverter.convert("DCCCLXXXVIII"));
        Assert.assertEquals(900, RomanNumeralToDecimalConverter.convert("CM"));
        Assert.assertEquals(901, RomanNumeralToDecimalConverter.convert("CMI"));
        Assert.assertEquals(946, RomanNumeralToDecimalConverter.convert("CMXLVI"));
        Assert.assertEquals(984, RomanNumeralToDecimalConverter.convert("CMLXXXIV"));
        Assert.assertEquals(999, RomanNumeralToDecimalConverter.convert("CMXCIX"));
        Assert.assertEquals(1000, RomanNumeralToDecimalConverter.convert("M"));

    }

    @Test
    public void testConvert1000s(){

        Assert.assertEquals(1001, RomanNumeralToDecimalConverter.convert("MI"));
        Assert.assertEquals(1125, RomanNumeralToDecimalConverter.convert("MCXXV"));
        Assert.assertEquals(1264, RomanNumeralToDecimalConverter.convert("MCCLXIV"));
        Assert.assertEquals(1389, RomanNumeralToDecimalConverter.convert("MCCCLXXXIX"));
        Assert.assertEquals(1527, RomanNumeralToDecimalConverter.convert("MDXXVII"));
        Assert.assertEquals(1754, RomanNumeralToDecimalConverter.convert("MDCCLIV"));
        Assert.assertEquals(1999, RomanNumeralToDecimalConverter.convert("MCMXCIX"));
        Assert.assertEquals(2000, RomanNumeralToDecimalConverter.convert("MM"));
        Assert.assertEquals(2089, RomanNumeralToDecimalConverter.convert("MMLXXXIX"));
        Assert.assertEquals(2371, RomanNumeralToDecimalConverter.convert("MMCCCLXXI"));
        Assert.assertEquals(2610, RomanNumeralToDecimalConverter.convert("MMDCX"));
        Assert.assertEquals(2888, RomanNumeralToDecimalConverter.convert("MMDCCCLXXXVIII"));
        Assert.assertEquals(2999, RomanNumeralToDecimalConverter.convert("MMCMXCIX"));
        Assert.assertEquals(3000, RomanNumeralToDecimalConverter.convert("MMM"));
    }

}