package no.clave.eirik.trening.romannumerals.domain.service;

import org.junit.Assert;
import org.junit.Test;


@SuppressWarnings("MagicNumber")
public class DecimalToRomanNumeralsConverterTests {

	@Test
	public void main() throws Exception {
	}

	@Test
	public void converter() throws Exception {
	}


	@Test
	public void testConvert() {
		Assert.assertEquals("MMCDLVI", DecimalToRomanNumeralsConverter.convert(2456));
		Assert.assertEquals("MDCLII", DecimalToRomanNumeralsConverter.convert(1652));
		Assert.assertEquals("MCMLXXXV", DecimalToRomanNumeralsConverter.convert(1985));
		Assert.assertEquals("MCXXXII", DecimalToRomanNumeralsConverter.convert(1132));
		Assert.assertEquals("CMLXXXIX", DecimalToRomanNumeralsConverter.convert(989));
		Assert.assertEquals("DCCLXXXIX", DecimalToRomanNumeralsConverter.convert(789));
		Assert.assertEquals("MMDCLXXVIII", DecimalToRomanNumeralsConverter.convert(2678));
		Assert.assertEquals("DCXCIX", DecimalToRomanNumeralsConverter.convert(699));
		Assert.assertEquals("CMXCIX", DecimalToRomanNumeralsConverter.convert(999));
		Assert.assertEquals("MDCCLXXXIV", DecimalToRomanNumeralsConverter.convert(1784));
		Assert.assertEquals("MMDI", DecimalToRomanNumeralsConverter.convert(2501));
		Assert.assertEquals("DCCCXLIX", DecimalToRomanNumeralsConverter.convert(849));
		Assert.assertEquals("MCMXXIV", DecimalToRomanNumeralsConverter.convert(1924));
		Assert.assertEquals("MMCMXCIX", DecimalToRomanNumeralsConverter.convert(2999));
		Assert.assertEquals("MMM", DecimalToRomanNumeralsConverter.convert(3000));
	}

	@Test
	public void testConvertSimpleNumber() {
		Assert.assertEquals("I", DecimalToRomanNumeralsConverter.convert(1));
		Assert.assertEquals("II", DecimalToRomanNumeralsConverter.convert(2));
		Assert.assertEquals("III", DecimalToRomanNumeralsConverter.convert(3));
		Assert.assertEquals("IV", DecimalToRomanNumeralsConverter.convert(4));
		Assert.assertEquals("V", DecimalToRomanNumeralsConverter.convert(5));
		Assert.assertEquals("VI", DecimalToRomanNumeralsConverter.convert(6));
		Assert.assertEquals("VII", DecimalToRomanNumeralsConverter.convert(7));
		Assert.assertEquals("VIII", DecimalToRomanNumeralsConverter.convert(8));
		Assert.assertEquals("IX", DecimalToRomanNumeralsConverter.convert(9));
		Assert.assertEquals("X", DecimalToRomanNumeralsConverter.convert(10));
	}

	@Test
	public void testConvert10s(){
		Assert.assertEquals("XI", DecimalToRomanNumeralsConverter.convert(11));
		Assert.assertEquals("XIV", DecimalToRomanNumeralsConverter.convert(14));
		Assert.assertEquals("XV", DecimalToRomanNumeralsConverter.convert(15));
		Assert.assertEquals("XIX", DecimalToRomanNumeralsConverter.convert(19));

	}

	@Test
	public void testConvert20s(){
		Assert.assertEquals("XX", DecimalToRomanNumeralsConverter.convert(20));
		Assert.assertEquals("XXI", DecimalToRomanNumeralsConverter.convert(21));
		Assert.assertEquals("XXIII", DecimalToRomanNumeralsConverter.convert(23));
		Assert.assertEquals("XXVI", DecimalToRomanNumeralsConverter.convert(26));
		Assert.assertEquals("XXIX", DecimalToRomanNumeralsConverter.convert(29));

	}

	@Test
	public void testConvert30s(){
		Assert.assertEquals("XXX", DecimalToRomanNumeralsConverter.convert(30));
		Assert.assertEquals("XXXII", DecimalToRomanNumeralsConverter.convert(32));
		Assert.assertEquals("XXXIV", DecimalToRomanNumeralsConverter.convert(34));
		Assert.assertEquals("XXXVII", DecimalToRomanNumeralsConverter.convert(37));
		Assert.assertEquals("XXXIX", DecimalToRomanNumeralsConverter.convert(39));

	}

	@Test
	public void testConvert40s(){
		Assert.assertEquals("XLIX", DecimalToRomanNumeralsConverter.convert(49));
		Assert.assertEquals("LIX", DecimalToRomanNumeralsConverter.convert(59));
		Assert.assertEquals("LXII", DecimalToRomanNumeralsConverter.convert(62));
		Assert.assertEquals("LXIX", DecimalToRomanNumeralsConverter.convert(69));
		Assert.assertEquals("XCVIII", DecimalToRomanNumeralsConverter.convert(98));

	}
}
