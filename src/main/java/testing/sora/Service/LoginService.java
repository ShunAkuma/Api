package testing.sora.Service;

import org.springframework.stereotype.Service;
import testing.sora.Exception.LoginExistException;
import testing.sora.Exception.PasswordExistException;
import testing.sora.Model.InputDto.LeadLoginInputModel;
import testing.sora.Repository.UserRepository;
//import testing.sora.Repository.UserRepository;

@Service
public class LoginService {
    private UserRepository userRepository;
    public LoginService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void login(LeadLoginInputModel model) throws LoginExistException, PasswordExistException {
        if(userRepository.findByLogin(model.getLogin()) == null){
            throw new LoginExistException("Пользователя с таким ником не существует!");
        }

        if (!userRepository.findByLogin(model.getLogin()).getPassword().equals(model.getPassword())){
            throw new PasswordExistException("Введенный пароль некорректен!");
        }
    }
}
