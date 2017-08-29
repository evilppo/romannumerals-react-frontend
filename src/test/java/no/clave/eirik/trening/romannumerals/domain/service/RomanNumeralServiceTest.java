package no.clave.eirik.trening.romannumerals.domain.service;

import no.clave.eirik.trening.romannumerals.domain.Number;
import no.clave.eirik.trening.romannumerals.domain.Validation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RomanNumeralServiceTest {


    @Mock
    private DecimalToRomanNumeralsConverter dToRConverterMock;

    @Mock
    private Validator validatorMock;

    @Mock
    private RomanNumeralToDecimalConverter rToDConverterMock;


    private RomanNumeralService romanNumeralService;


    @Before
    public void setUp() throws Exception {
        romanNumeralService = new RomanNumeralService(validatorMock, dToRConverterMock, rToDConverterMock);
    }

    @Test
    public void serviceShouldUseVerifyAndConvertTest() throws Exception {

        when(validatorMock.decimal(any())).thenReturn(new Validation(Validation.Status.OK, null));

        romanNumeralService.convertDecimal(new Number());

        verify(validatorMock).decimal(any());
        verify(dToRConverterMock).convert(anyInt());
    }

    @Test
    public void verifyAndConvertRomanToDecimal() throws Exception {

        when(validatorMock.romanNumeral(any())).thenReturn(new Validation(Validation.Status.OK, null));

        romanNumeralService.convertRomanNumeral(new Number());

        verify(validatorMock).romanNumeral(any());
        verify(rToDConverterMock).convert(any());
    }
}