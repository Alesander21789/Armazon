package es.storeapp.web.forms;

import javax.validation.constraints.Pattern;

public class PaymentForm {
    
    private Boolean defaultCreditCard;
    @Pattern(regexp = "^(4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14})$")
    private String creditCard;
    /**
     * ^ - Comienzo de la cadena
     * 4[0-9]{12} - Empieza con el número 4 seguido de 12 dígitos
     * (?:[0-9]{3})? - Opcionalmente, puede tener tres dígitos adicionales
     * | - Alternativamente, puede ser
     * 5[1-5][0-9]{14} - El número 5 seguido de un número entre 1 y 5, y 14 dígitos adicionales
     * $ - Fin de la cadena
     */
    @Pattern(regexp = "^[0-9]{3,4}$")
    private Integer cvv;
    /**
     * ^ - Comienzo de la cadena
     * [0-9]{3,4} - Tres o cuatro dígitos consecutivos
     * $ - Fin de la cadena
     */
    @Pattern(regexp = "^(0?[1-9]|1[0-2])$")
    private Integer expirationMonth;
    /**
     * ^ - Comienzo de la cadena
     * 0?[1-9] - Un dígito opcional 0 seguido de un dígito entre 1 y 9
     * | - Alternativamente, puede ser
     * 1[0-2] - El número 1 seguido de un dígito entre 0 y 2
     * $ - Fin de la cadena
     */
    @Pattern(regexp = "^(\\d{2}|\\d{4})$")
    private Integer expirationYear;
    /**
     * ^ - Comienzo de la cadena
     * \\d{2} - Dos dígitos consecutivos
     * | - Alternativamente, puede ser
     * \\d{4} - Cuatro dígitos consecutivos
     * $ - Fin de la cadena
     */
    private Boolean save;

    public Boolean getDefaultCreditCard() {
        return defaultCreditCard;
    }

    public void setDefaultCreditCard(Boolean defaultCreditCard) {
        this.defaultCreditCard = defaultCreditCard;
    }
    
    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public Boolean getSave() {
        return save;
    }

    public void setSave(Boolean save) {
        this.save = save;
    }
    
}
