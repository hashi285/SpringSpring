package org.example.springpre.도메인;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.thymeleaf.messageresolver.IMessageResolver;

@Getter
@Setter
public class UserForm {
    @NotEmpty(message = "username은 공백을 허용하지 않느다.")
    @Size(min = 4, max = 20, message = "4에서 20자까지만 허용된다.")
    private String username;

    @NotEmpty(message = "passwordsms 공백을 허용하지 않느다.")
    @Size(min = 4,  message = "4에서 20자까지만 허용된다.")
    private String password;
}
