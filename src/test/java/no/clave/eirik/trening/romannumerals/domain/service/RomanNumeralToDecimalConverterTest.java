package no.clave.eirik.trening.romannumerals.domain.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("MagicNumber")
public class RomanNumeralToDecimalConverterTest {

    private RomanNumeralToDecimalConverter romanNumeralToDecimalConverter;

    @Before
    public void setUp() throws Exception {
        romanNumeralToDecimalConverter = new RomanNumeralToDecimalConverter();
    }

    @Test
    public void testConvertSimpleNumeral() {
        Assert.assertEquals(1, romanNumeralToDecimalConverter.convert("I"));
        Assert.assertEquals(2, romanNumeralToDecimalConverter.convert("II"));
        Assert.assertEquals(3, romanNumeralToDecimalConverter.convert("III"));
        Assert.assertEquals(4, romanNumeralToDecimalConverter.convert("IV"));
        Assert.assertEquals(5, romanNumeralToDecimalConverter.convert("V"));
        Assert.assertEquals(6, romanNumeralToDecimalConverter.convert("VI"));
        Assert.assertEquals(7, romanNumeralToDecimalConverter.convert("VII"));
        Assert.assertEquals(8, romanNumeralToDecimalConverter.convert("VIII"));
        Assert.assertEquals(9, romanNumeralToDecimalConverter.convert("IX"));
        Assert.assertEquals(10, romanNumeralToDecimalConverter.convert("X"));

    }

    @Test
    public void testConvert10s(){

        Assert.assertEquals(11, romanNumeralToDecimalConverter.convert("XI"));
        Assert.assertEquals(13, romanNumeralToDecimalConverter.convert("XIII"));
        Assert.assertEquals(16, romanNumeralToDecimalConverter.convert("XVI"));
        Assert.assertEquals(18, romanNumeralToDecimalConverter.convert("XVIII"));
        Assert.assertEquals(19, romanNumeralToDecimalConverter.convert("XIX"));
        Assert.assertEquals(20, romanNumeralToDecimalConverter.convert("XX"));
        Assert.assertEquals(21, romanNumeralToDecimalConverter.convert("XXI"));
        Assert.assertEquals(25, romanNumeralToDecimalConverter.convert("XXV"));
        Assert.assertEquals(29, romanNumeralToDecimalConverter.convert("XXIX"));
        Assert.assertEquals(30, romanNumeralToDecimalConverter.convert("XXX"));
        Assert.assertEquals(33, romanNumeralToDecimalConverter.convert("XXXIII"));
        Assert.assertEquals(37, romanNumeralToDecimalConverter.convert("XXXVII"));
        Assert.assertEquals(39, romanNumeralToDecimalConverter.convert("XXXIX"));
        Assert.assertEquals(40, romanNumeralToDecimalConverter.convert("XL"));
        Assert.assertEquals(44, romanNumeralToDecimalConverter.convert("XLIV"));
        Assert.assertEquals(46, romanNumeralToDecimalConverter.convert("XLVI"));
        Assert.assertEquals(50, romanNumeralToDecimalConverter.convert("L"));
        Assert.assertEquals(55, romanNumeralToDecimalConverter.convert("LV"));
        Assert.assertEquals(60, romanNumeralToDecimalConverter.convert("LX"));
        Assert.assertEquals(69, romanNumeralToDecimalConverter.convert("LXIX"));
        Assert.assertEquals(70, romanNumeralToDecimalConverter.convert("LXX"));
        Assert.assertEquals(74, romanNumeralToDecimalConverter.convert("LXXIV"));
        Assert.assertEquals(82, romanNumeralToDecimalConverter.convert("LXXXII"));
        Assert.assertEquals(88, romanNumeralToDecimalConverter.convert("LXXXVIII"));
        Assert.assertEquals(90, romanNumeralToDecimalConverter.convert("XC"));
        Assert.assertEquals(91, romanNumeralToDecimalConverter.convert("XCI"));
        Assert.assertEquals(99, romanNumeralToDecimalConverter.convert("XCIX"));

    }

    @Test
    public void  testConvert100s(){

        Assert.assertEquals(100, romanNumeralToDecimalConverter.convert("C"));
        Assert.assertEquals(134, romanNumeralToDecimalConverter.convert("CXXXIV"));
        Assert.assertEquals(179, romanNumeralToDecimalConverter.convert("CLXXIX"));
        Assert.assertEquals(200, romanNumeralToDecimalConverter.convert("CC"));
        Assert.assertEquals(204, romanNumeralToDecimalConverter.convert("CCIV"));
        Assert.assertEquals(213, romanNumeralToDecimalConverter.convert("CCXIII"));
        Assert.assertEquals(238, romanNumeralToDecimalConverter.convert("CCXXXVIII"));
        Assert.assertEquals(256, romanNumeralToDecimalConverter.convert("CCLVI"));
        Assert.assertEquals(273, romanNumeralToDecimalConverter.convert("CCLXXIII"));
        Assert.assertEquals(298, romanNumeralToDecimalConverter.convert("CCXCVIII"));
        Assert.assertEquals(313, romanNumeralToDecimalConverter.convert("CCCXIII"));
        Assert.assertEquals(339, romanNumeralToDecimalConverter.convert("CCCXXXIX"));
        Assert.assertEquals(372, romanNumeralToDecimalConverter.convert("CCCLXXII"));
        Assert.assertEquals(381, romanNumeralToDecimalConverter.convert("CCCLXXXI"));
        Assert.assertEquals(399, romanNumeralToDecimalConverter.convert("CCCXCIX"));
        Assert.assertEquals(400, romanNumeralToDecimalConverter.convert("CD"));
        Assert.assertEquals(401, romanNumeralToDecimalConverter.convert("CDI"));
        Assert.assertEquals(426, romanNumeralToDecimalConverter.convert("CDXXVI"));
        Assert.assertEquals(441, romanNumeralToDecimalConverter.convert("CDXLI"));
        Assert.assertEquals(454, romanNumeralToDecimalConverter.convert("CDLIV"));
        Assert.assertEquals(473, romanNumeralToDecimalConverter.convert("CDLXXIII"));
        Assert.assertEquals(488, romanNumeralToDecimalConverter.convert("CDLXXXVIII"));
        Assert.assertEquals(499, romanNumeralToDecimalConverter.convert("CDXCIX"));
        Assert.assertEquals(500, romanNumeralToDecimalConverter.convert("D"));
        Assert.assertEquals(557, romanNumeralToDecimalConverter.convert("DLVII"));
        Assert.assertEquals(592, romanNumeralToDecimalConverter.convert("DXCII"));
        Assert.assertEquals(600, romanNumeralToDecimalConverter.convert("DC"));
        Assert.assertEquals(634, romanNumeralToDecimalConverter.convert("DCXXXIV"));
        Assert.assertEquals(679, romanNumeralToDecimalConverter.convert("DCLXXIX"));
        Assert.assertEquals(700, romanNumeralToDecimalConverter.convert("DCC"));
        Assert.assertEquals(702, romanNumeralToDecimalConverter.convert("DCCII"));
        Assert.assertEquals(710, romanNumeralToDecimalConverter.convert("DCCX"));
        Assert.assertEquals(759, romanNumeralToDecimalConverter.convert("DCCLIX"));
        Assert.assertEquals(789, romanNumeralToDecimalConverter.convert("DCCLXXXIX"));
        Assert.assertEquals(800, romanNumeralToDecimalConverter.convert("DCCC"));
        Assert.assertEquals(809, romanNumeralToDecimalConverter.convert("DCCCIX"));
        Assert.assertEquals(811, romanNumeralToDecimalConverter.convert("DCCCXI"));
        Assert.assertEquals(854, romanNumeralToDecimalConverter.convert("DCCCLIV"));
        Assert.assertEquals(888, romanNumeralToDecimalConverter.convert("DCCCLXXXVIII"));
        Assert.assertEquals(900, romanNumeralToDecimalConverter.convert("CM"));
        Assert.assertEquals(901, romanNumeralToDecimalConverter.convert("CMI"));
        Assert.assertEquals(946, romanNumeralToDecimalConverter.convert("CMXLVI"));
        Assert.assertEquals(984, romanNumeralToDecimalConverter.convert("CMLXXXIV"));
        Assert.assertEquals(999, romanNumeralToDecimalConverter.convert("CMXCIX"));
        Assert.assertEquals(1000, romanNumeralToDecimalConverter.convert("M"));

    }

    @Test
    public void testConvert1000s(){

        Assert.assertEquals(1001, romanNumeralToDecimalConverter.convert("MI"));
        Assert.assertEquals(1125, romanNumeralToDecimalConverter.convert("MCXXV"));
        Assert.assertEquals(1264, romanNumeralToDecimalConverter.convert("MCCLXIV"));
        Assert.assertEquals(1389, romanNumeralToDecimalConverter.convert("MCCCLXXXIX"));
        Assert.assertEquals(1527, romanNumeralToDecimalConverter.convert("MDXXVII"));
        Assert.assertEquals(1754, romanNumeralToDecimalConverter.convert("MDCCLIV"));
        Assert.assertEquals(1999, romanNumeralToDecimalConverter.convert("MCMXCIX"));
        Assert.assertEquals(2000, romanNumeralToDecimalConverter.convert("MM"));
        Assert.assertEquals(2089, romanNumeralToDecimalConverter.convert("MMLXXXIX"));
        Assert.assertEquals(2371, romanNumeralToDecimalConverter.convert("MMCCCLXXI"));
        Assert.assertEquals(2610, romanNumeralToDecimalConverter.convert("MMDCX"));
        Assert.assertEquals(2888, romanNumeralToDecimalConverter.convert("MMDCCCLXXXVIII"));
        Assert.assertEquals(2999, romanNumeralToDecimalConverter.convert("MMCMXCIX"));
        Assert.assertEquals(3000, romanNumeralToDecimalConverter.convert("MMM"));
    }
}