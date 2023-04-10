package es.storeapp.web.forms;

import javax.validation.constraints.Pattern;

public class ChangePasswordForm {

    @Pattern(regexp =  "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{10,}$")
    private String oldPassword;
    /**
     * ^ - Comienzo de la cadena
     * (?=.*[a-z]) - Al menos una letra minúscula
     * (?=.*[A-Z]) - Al menos una letra mayúscula
     * (?=.*\\d) - Al menos un dígito
     * (?=.*[@$!%*?&]) - Al menos un carácter especial entre @$!%*?&
     * [A-Za-z\\d@$!%*?&]{10,} - Debe tener 10 o más caracteres, y puede contener letras mayúsculas o minúsculas, dígitos, y carácteres especiales @$!%*?&
     * $ - Fin de la cadena
     */
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

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
