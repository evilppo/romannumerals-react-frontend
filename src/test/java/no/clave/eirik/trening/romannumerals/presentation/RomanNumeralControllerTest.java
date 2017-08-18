package no.clave.eirik.trening.romannumerals.presentation;

import no.clave.eirik.trening.romannumerals.domain.Number;
import no.clave.eirik.trening.romannumerals.domain.service.RomanNumeralService;
import org.junit.Test;

public class RomanNumeralControllerTest {

    @Test(expected = IllegalArgumentException.class)
    public void expectErrorWhenRomanNumeralNotSet() throws Exception {

        RomanNumeralController c = new RomanNumeralController(new RomanNumeralService());

        c.romanToDecimal(new Number(0, null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void expectErrorWhenDecimalNotSet() throws Exception {

        RomanNumeralController c = new RomanNumeralController(new RomanNumeralService());

        c.decimalToRoman(new Number(0, null));
    }
}