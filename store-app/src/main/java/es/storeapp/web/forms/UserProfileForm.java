package es.storeapp.web.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public class UserProfileForm {

    @NotNull
    @Size(min=4)
    @Pattern(regexp = "^[a-zA-Z0-9._-]{3,}$")
    private String name;

    /**
     * ^ - Comienzo de la cadena
     * [a-zA-Z0-9._-] - Cualquier carácter alfanumérico o un guion bajo, un punto o un guión.
     * {3,} - Longitud mínima de 3 caracteres
     * $ - Fin de la cadena
     */

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



    private MultipartFile image;

    public UserProfileForm() {
    }

    public UserProfileForm(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }    
    
}
