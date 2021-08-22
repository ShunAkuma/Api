package testing.sora.Rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testing.sora.Exception.NicknameExistException;
import testing.sora.Model.lead;
import testing.sora.Service.RegService;

@RestController
@RequestMapping("/main")
public class Registrations {
    private RegService regService;
    public Registrations(RegService regService){
        this.regService = regService;
    }
    @PostMapping("/registrations")
    public ResponseEntity reg(@RequestBody lead user) throws NicknameExistException {
        regService.registration(user);
        return ResponseEntity.ok("Пользователь успешно создан !");
    }
}
