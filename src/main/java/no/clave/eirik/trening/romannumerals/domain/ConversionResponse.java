package no.clave.eirik.trening.romannumerals.domain;

public class ConversionResponse {

    private Number number;
    private Validation validation;

    public ConversionResponse(Number number, Validation validation) {
        this.number = number;
        this.validation = validation;
    }

    public Validation getValidation() {
        return validation;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }
}