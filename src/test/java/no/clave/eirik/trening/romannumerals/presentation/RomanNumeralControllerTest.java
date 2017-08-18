package no.clave.eirik.trening.romannumerals.presentation;

import no.clave.eirik.trening.romannumerals.domain.RomanNumeralService;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralControllerTest {

    @Test
    public void testConvert() throws Exception {

        RomanNumeralController c = new RomanNumeralController(new RomanNumeralService());

        c.RomanToDecimal("X");
    }
}