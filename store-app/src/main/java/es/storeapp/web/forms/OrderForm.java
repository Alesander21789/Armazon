package es.storeapp.web.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class OrderForm {
    @Pattern(regexp = "^[a-zA-Z0-9._-]{3,}$")
    private String name;
    /**
     * ^ - Comienzo de la cadena
     * [a-zA-Z0-9._-] - Cualquier carácter alfanumérico o un guion bajo, un punto o un guión.
     * {3,} - Longitud mínima de 3 caracteres
     * $ - Fin de la cadena
     */
    @NotNull
    @Pattern(regexp = "^\\d+(\\.\\d{1,2})?$")
    private int price;
    /**
     * ^ - Comienzo de la cadena
     * \\d+ - Uno o más dígitos
     * (\\.\\d{1,2})? - Un punto seguido de uno o dos dígitos opcionales
     * ?$ - Fin de la cadena
     */
    @NotNull
    @Pattern(regexp = "^\\d+\\s+([a-zA-Z]+\\s)*[a-zA-Z]+$")
    private String address;
    /**
     * ^ - Comienzo de la cadena
     * \\d+ - Uno o más dígitos
     * \\s+ - Uno o más espacios en blanco
     * ([a-zA-Z]+\\s)* - Cero o más palabras separadas por un espacio en blanco (una palabra se define como una secuencia de una o más letras mayúsculas o minúsculas)
     * [a-zA-Z]+ - Una palabra (definida como una secuencia de una o más letras mayúsculas o minúsculas)
     * $ - Fin de la cadena
     */
    private Boolean payNow;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getPayNow() {
        return payNow;
    }

    public void setPayNow(Boolean payNow) {
        this.payNow = payNow;
    }
        
}
