package testing.sora.Service;

import org.springframework.stereotype.Service;
import testing.sora.Exception.LoginExistException;
import testing.sora.Exception.PasswordExistException;
import testing.sora.Repository.UserRepository;
//import testing.sora.Repository.UserRepository;

@Service
public class LoginService {
    private UserRepository userRepository;
    public LoginService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void login(String login, String password) throws LoginExistException, PasswordExistException {
        if(userRepository.findByLogin(login) == null){
            throw new LoginExistException("Пользователя с таким ником не существует!");
        }

        if (!userRepository.findByLogin(login).getPassword().equals(password)){
            throw new PasswordExistException("Введенный пароль некорректен!");
        }
    }
}
