package no.clave.eirik.trening.romannumerals.domain;

import org.springframework.util.StringUtils;

public class Number {

    public Integer decimal;
    public String romanNumeral;

    public Number(Integer decimal, String romanNumeral) {
        this.decimal = decimal;
        this.romanNumeral = romanNumeral;
    }

    public Number() {
    }

    public boolean hasRomanNumeral() {
        return !StringUtils.isEmpty(romanNumeral);
    }
}
