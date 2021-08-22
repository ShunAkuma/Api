package testing.sora.Service;

import org.springframework.stereotype.Service;
import testing.sora.Exception.NicknameExistException;
import testing.sora.Exception.UserDoesNotExistException;
import testing.sora.Model.between_lead_friend;
import testing.sora.Model.friend;
import testing.sora.Model.lead;
import testing.sora.Repository.FriendRepository;
import testing.sora.Repository.ILeadFriendRepository;
import testing.sora.Repository.UserRepository;

@Service
public class LeadService {
    private FriendRepository friendRepository;
    private ILeadFriendRepository leadFriendRepository;
    private UserRepository userRepository;

    public LeadService(FriendRepository friendRepository, ILeadFriendRepository leadFriendRepository, UserRepository userRepository) {
        this.friendRepository = friendRepository;
        this.leadFriendRepository = leadFriendRepository;
        this.userRepository = userRepository;
    }
    public void addNewFriend(String nicknameFriend, String nickname) throws NicknameExistException, UserDoesNotExistException {
        if (userRepository.findByNickname(nickname) == null){
            throw new NicknameExistException("Пользователя с таким ником не существует");
        }
        lead user = userRepository.findByNickname(nickname);


        if (userRepository.findByNickname(nicknameFriend) == null){
            throw new UserDoesNotExistException("Пользователя с таким Id не существует!");
        }
        lead friendLead = userRepository.findByNickname(nicknameFriend);
        friend friend = new friend(friendLead.getName(),friendLead.getFamily(),friendLead.getNickname());

    ///попробовать передавать id пользователя, который будет другом тоже.
        leadFriendRepository.save(new between_lead_friend(user,friend));
    }

    public lead changeNick(String nickname,String password,String newNickName) throws Exception {
        if (userRepository.findByNickname(nickname) == null){
            throw new Exception("User is null");
        }
        if (!userRepository.findByNickname(nickname).getPassword().equals(password)) {
            throw new Exception("User Exist");
        }
        lead user = userRepository.findByNickname(nickname);
        if (user == null){
            throw new Exception("User is null");
        }

        user.setNickname(newNickName);
        return userRepository.save(user);
    }


    public lead deleteAccount(String nickname, String password) throws Exception {
        if (!userRepository.findByNickname(nickname).getPassword().equals(password)){
            throw new Exception("New Exception");
        }
        lead deleteduser = userRepository.findByNickname(nickname);
        userRepository.delete(userRepository.findByNickname(nickname));

        return deleteduser;
    }


}
