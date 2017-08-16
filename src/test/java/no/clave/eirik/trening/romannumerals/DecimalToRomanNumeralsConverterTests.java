package no.clave.eirik.trening.romannumerals;

import org.junit.Assert;
import org.junit.Test;


public class DecimalToRomanNumeralsConverterTests {

	@Test
	public void main() throws Exception {
	}

	@Test
	public void converter() throws Exception {
	}


	@Test
	public void testConvert() {
		Assert.assertEquals("MMCDLVI", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(2456));
		Assert.assertEquals("MDCLII", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(1652));
		Assert.assertEquals("MCMLXXXV", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(1985));
		Assert.assertEquals("MCXXXII", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(1132));
		Assert.assertEquals("CMLXXXIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(989));
		Assert.assertEquals("DCCLXXXIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(789));
		Assert.assertEquals("MMDCLXXVIII", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(2678));
		Assert.assertEquals("DCXCIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(699));
		Assert.assertEquals("CMXCIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(999));
		Assert.assertEquals("MDCCLXXXIV", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(1784));
		Assert.assertEquals("MMDI", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(2501));
		Assert.assertEquals("DCCCXLIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(849));
		Assert.assertEquals("MCMXXIV", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(1924));
		Assert.assertEquals("MMCMXCIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(2999));
		Assert.assertEquals("MMM", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(3000));
	}

	@Test
	public void testConvertSimpleNumber() {
		Assert.assertEquals("I", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(1));
		Assert.assertEquals("II", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(2));
		Assert.assertEquals("III", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(3));
		Assert.assertEquals("IV", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(4));
		Assert.assertEquals("V", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(5));
		Assert.assertEquals("VI", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(6));
		Assert.assertEquals("VII", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(7));
		Assert.assertEquals("VIII", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(8));
		Assert.assertEquals("IX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(9));
		Assert.assertEquals("X", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(10));
	}

	@Test
	public void testConvert10s(){
		Assert.assertEquals("XI", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(11));
		Assert.assertEquals("XIV", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(14));
		Assert.assertEquals("XV", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(15));
		Assert.assertEquals("XIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(19));

	}

	@Test
	public void testConvert20s(){
		Assert.assertEquals("XX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(20));
		Assert.assertEquals("XXI", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(21));
		Assert.assertEquals("XXIII", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(23));
		Assert.assertEquals("XXVI", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(26));
		Assert.assertEquals("XXIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(29));

	}

	@Test
	public void testConvert30s(){
		Assert.assertEquals("XXX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(30));
		Assert.assertEquals("XXXII", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(32));
		Assert.assertEquals("XXXIV", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(34));
		Assert.assertEquals("XXXVII", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(37));
		Assert.assertEquals("XXXIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(39));

	}

	@Test
	public void testConvert40s(){
		Assert.assertEquals("XLIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(49));
		Assert.assertEquals("LIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(59));
		Assert.assertEquals("LXII", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(62));
		Assert.assertEquals("LXIX", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(69));
		Assert.assertEquals("XCVIII", DecimalToRomanNumeralsConverter.convertDecimalToRomanNumeral(98));

	}
}
