package es.storeapp.web.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CommentForm {
    @NotNull
    @Pattern(regexp = "^-?\\d{1,19}$")
    private Long productId;
    /**
     *^ - Comienzo de la cadena
     * -? - Un signo negativo opcional
     * \\d{1,19} - Entre 1 y 19 dígitos
     * $ - Fin de la cadena
     */
    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9áéíóúÁÉÍÓÚ\\.\\s]+$")
    private String text;
    /**
     * ^ - Comienzo de la cadena
     * [a-zA-Z0-9áéíóúÁÉÍÓÚ\\.\\s]+ - Uno o más caracteres alfabéticos, numéricos, acentos, puntos y espacios en blanco
     * $ - Fin de la cadena
      */
    @NotNull
    @Pattern(regexp = "^[1-9]|10$")
    private Integer rating;

    /**
     * ^: Indica que la coincidencia debe comenzar desde el inicio de la cadena.
     * [1-9]: Indica que debe coincidir con cualquier dígito entre 1 y 9.
     * |: Indica una opción alternativa, es decir, puede coincidir con la expresión anterior o la siguiente.
     * 10: Indica que debe coincidir con el número 10.
     * $: Indica que la coincidencia debe terminar al final de la cadena.Co
     * @return
     */

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    
}
