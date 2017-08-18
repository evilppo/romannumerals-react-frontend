package no.clave.eirik.trening.romannumerals.domain;

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
        return romanNumeral != null;
    }

    public boolean hasDecimal() {
        return decimal != 0;
    }
}
