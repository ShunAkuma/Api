package testing.sora.Rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.sora.Exception.NicknameExistException;
import testing.sora.Exception.UserDoesNotExistException;
import testing.sora.Service.LeadService;

@RestController
@RequestMapping("/main")
public class LeadController {

    private LeadService leadService;

    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }

    @PostMapping("/addFriend")
    public ResponseEntity addNewFriend( @RequestParam String nickname, String nicknameFriend) throws NicknameExistException, UserDoesNotExistException {
        leadService.addNewFriend(nicknameFriend,nickname);
        return ResponseEntity.ok("YEap");
    }

    @PutMapping("/changeinfo")
    public ResponseEntity changeNickname(@RequestParam String nickname, String password, String newNickName ) throws Exception {
        leadService.changeNick(nickname,password,newNickName);
        return ResponseEntity.ok("Никнейнм был обновлён " + newNickName);
    }

    @DeleteMapping("/DeleteAccount")
    public ResponseEntity deleteAcc(@RequestParam String nickname, String password) throws Exception {
        return ResponseEntity.ok(leadService.deleteAccount(nickname,password));
    }
    
}
