package testing.sora.Service;

import org.springframework.stereotype.Service;
import testing.sora.Exception.NicknameExistException;
import testing.sora.Model.lead;
import testing.sora.Repository.UserRepository;
//import testing.sora.Repository.UserRepository;

@Service
public class RegService {
    private UserRepository userRepository;
    public RegService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void registration(lead lead) throws NicknameExistException {
        if(userRepository.findByNickname(lead.getNickname()) != null){
            throw new NicknameExistException();
        }
        userRepository.save(lead);
    }
}
