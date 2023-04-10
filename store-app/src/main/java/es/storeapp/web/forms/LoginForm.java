package es.storeapp.web.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginForm {

    @NotNull
    @Pattern(regexp = "^(.+)@(\\S+)$")
    private String email;
    /**
     * ^ - Comienzo de la cadena
     * (.+) - Uno o más caracteres de cualquier tipo (capturados en el primer grupo de captura)
     * @ - El carácter @
     * (\\S+) - Uno o más caracteres que no son espacios en blanco (capturados en el segundo grupo de captura)
     * $ - Fin de la cadena
     */
    @NotNull
    @Pattern(regexp =  "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{10,}$")
    private String password;
    /**
     * ^ - Comienzo de la cadena
     * (?=.*[a-z]) - Al menos una letra minúscula
     * (?=.*[A-Z]) - Al menos una letra mayúscula
     * (?=.*\\d) - Al menos un dígito
     * (?=.*[@$!%*?&]) - Al menos un carácter especial entre @$!%*?&
     * [A-Za-z\\d@$!%*?&]{10,} - Debe tener 10 o más caracteres, y puede contener letras mayúsculas o minúsculas, dígitos, y carácteres especiales @$!%*?&
     * $ - Fin de la cadena
     */

    private Boolean rememberMe;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
    
    
    
}
