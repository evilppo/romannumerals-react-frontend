package no.clave.eirik.trening.romannumerals.domain.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


@SuppressWarnings("MagicNumber")
public class DecimalToRomanNumeralsConverterTests {

    private DecimalToRomanNumeralsConverter decimalToRomanNumeralsConverter;

    @Before
	public void setUp() throws Exception {

        decimalToRomanNumeralsConverter = new DecimalToRomanNumeralsConverter();
	}

	@Test
	public void testRandomConvert() {
		Assert.assertEquals("MMCDLVI", decimalToRomanNumeralsConverter.convert(2456));
		Assert.assertEquals("MDCLII", decimalToRomanNumeralsConverter.convert(1652));
		Assert.assertEquals("MCMLXXXV", decimalToRomanNumeralsConverter.convert(1985));
		Assert.assertEquals("MCXXXII", decimalToRomanNumeralsConverter.convert(1132));
		Assert.assertEquals("CMLXXXIX", decimalToRomanNumeralsConverter.convert(989));
		Assert.assertEquals("DCCLXXXIX", decimalToRomanNumeralsConverter.convert(789));
		Assert.assertEquals("MMDCLXXVIII", decimalToRomanNumeralsConverter.convert(2678));
		Assert.assertEquals("DCXCIX", decimalToRomanNumeralsConverter.convert(699));
		Assert.assertEquals("CMXCIX", decimalToRomanNumeralsConverter.convert(999));
		Assert.assertEquals("MDCCLXXXIV", decimalToRomanNumeralsConverter.convert(1784));
		Assert.assertEquals("MMDI", decimalToRomanNumeralsConverter.convert(2501));
		Assert.assertEquals("DCCCXLIX", decimalToRomanNumeralsConverter.convert(849));
		Assert.assertEquals("MCMXXIV", decimalToRomanNumeralsConverter.convert(1924));
		Assert.assertEquals("MMCMXCIX", decimalToRomanNumeralsConverter.convert(2999));
		Assert.assertEquals("MMM", decimalToRomanNumeralsConverter.convert(3000));
	}

	@Test
	public void testConvertSimpleNumber() {
		Assert.assertEquals("I", decimalToRomanNumeralsConverter.convert(1));
		Assert.assertEquals("II", decimalToRomanNumeralsConverter.convert(2));
		Assert.assertEquals("III", decimalToRomanNumeralsConverter.convert(3));
		Assert.assertEquals("IV", decimalToRomanNumeralsConverter.convert(4));
		Assert.assertEquals("V", decimalToRomanNumeralsConverter.convert(5));
		Assert.assertEquals("VI", decimalToRomanNumeralsConverter.convert(6));
		Assert.assertEquals("VII", decimalToRomanNumeralsConverter.convert(7));
		Assert.assertEquals("VIII", decimalToRomanNumeralsConverter.convert(8));
		Assert.assertEquals("IX", decimalToRomanNumeralsConverter.convert(9));
		Assert.assertEquals("X", decimalToRomanNumeralsConverter.convert(10));
	}

	@Test
	public void testConvert10s(){
		Assert.assertEquals("XI", decimalToRomanNumeralsConverter.convert(11));
		Assert.assertEquals("XIV", decimalToRomanNumeralsConverter.convert(14));
		Assert.assertEquals("XV", decimalToRomanNumeralsConverter.convert(15));
		Assert.assertEquals("XIX", decimalToRomanNumeralsConverter.convert(19));

	}

	@Test
	public void testConvert20s(){
		Assert.assertEquals("XX", decimalToRomanNumeralsConverter.convert(20));
		Assert.assertEquals("XXI", decimalToRomanNumeralsConverter.convert(21));
		Assert.assertEquals("XXIII", decimalToRomanNumeralsConverter.convert(23));
		Assert.assertEquals("XXVI", decimalToRomanNumeralsConverter.convert(26));
		Assert.assertEquals("XXIX", decimalToRomanNumeralsConverter.convert(29));

	}

	@Test
	public void testConvert30s(){
		Assert.assertEquals("XXX", decimalToRomanNumeralsConverter.convert(30));
		Assert.assertEquals("XXXII", decimalToRomanNumeralsConverter.convert(32));
		Assert.assertEquals("XXXIV", decimalToRomanNumeralsConverter.convert(34));
		Assert.assertEquals("XXXVII", decimalToRomanNumeralsConverter.convert(37));
		Assert.assertEquals("XXXIX", decimalToRomanNumeralsConverter.convert(39));

	}

	@Test
	public void testConvert40s(){
		Assert.assertEquals("XLIX", decimalToRomanNumeralsConverter.convert(49));
		Assert.assertEquals("LIX", decimalToRomanNumeralsConverter.convert(59));
		Assert.assertEquals("LXII", decimalToRomanNumeralsConverter.convert(62));
		Assert.assertEquals("LXIX", decimalToRomanNumeralsConverter.convert(69));
		Assert.assertEquals("XCVIII", decimalToRomanNumeralsConverter.convert(98));

	}
}
