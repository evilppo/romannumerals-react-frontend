package no.clave.eirik.trening.romannumerals.domain;

import org.springframework.util.StringUtils;

public class Number {

    public int decimal;
    public String romanNumeral;

    public Number(int decimal, String romanNumeral) {
        this.decimal = decimal;
        this.romanNumeral = romanNumeral;
    }

    public Number() {
    }

    public boolean hasRomanNumeral() {
        return !StringUtils.isEmpty(romanNumeral);
    }

    public boolean hasDecimal() {
        return decimal != 0;
    }
}
