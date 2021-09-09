package testing.sora.Rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import testing.sora.Exception.LoginExistException;
import testing.sora.Exception.PasswordExistException;
import testing.sora.Model.InputDto.LeadLoginInputModel;
import testing.sora.Service.LoginService;

@RestController
@RequestMapping("/main")
public class Login {
    private LoginService userService;
    private Login(LoginService userService){
        this.userService = userService;
    }
    @PostMapping("/login")
    public ResponseEntity login(LeadLoginInputModel model) throws PasswordExistException, LoginExistException {
        userService.login(model);
        return ResponseEntity.ok("Авторизация выполнена успешно");
    }
}
