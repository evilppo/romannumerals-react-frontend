package no.clave.eirik.trening.romannumerals.domain;

public class ConversionRequest {

    private Number number;
    private String status;
    private String validationMsg;

    public ConversionRequest(Number number) {
        this.number = number;
        this.status = "OK";
        this.validationMsg = "OK";
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValidationMsg() {
        return validationMsg;
    }

    public void setValidationMsg(String validationMsg) {
        this.validationMsg = validationMsg;
    }
}