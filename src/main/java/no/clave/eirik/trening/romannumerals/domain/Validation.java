package no.clave.eirik.trening.romannumerals.domain;

public class Validation {

    private Status status;
    private String validationMsg;

    public Validation(Status status, String validationMsg){
        this.status = status;
        this.validationMsg = validationMsg;
    }

    public String getValidationMsg() {
        return validationMsg;
    }

    public Status getStatus() {
        return status;
    }

    public boolean isValid() {
        return this.status.equals(Status.OK);
    }

    public enum Status{
        OK, VALIDATION_FAILED
    }
}
