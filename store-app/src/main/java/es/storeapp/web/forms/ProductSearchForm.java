package es.storeapp.web.forms;

import javax.validation.constraints.Pattern;

public class ProductSearchForm {
    @Pattern(regexp = "^[A-Za-z]\\d{3}$")
    private String category;

    /**
     *
     * ^ - Comienzo de la cadena
     * [A-Za-z] - Una letra mayúscula o minúscula
     * \\d{3} - Tres dígitos consecutivos
     * $ - Fin de la cadena
     */

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}
