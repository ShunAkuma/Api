package testing.sora.Service;

import org.springframework.stereotype.Service;
import testing.sora.Exception.NoSuchPostExists;
import testing.sora.Exception.UserDoesNotExistException;
import testing.sora.Model.lead;
import testing.sora.Model.post;
import testing.sora.Repository.PostRepository;
import testing.sora.Repository.UserRepository;

import java.util.List;

@Service
public class PostService {
    private PostRepository postRepository;
    private UserRepository userRepository;

    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public post createPost(post post) throws Exception {
        if (post.getAuthornickname().equals(userRepository.findByNickname(post.getAuthornickname())) ){
            throw new Exception("Пользователь с таким именем не найден!");
        }
        return postRepository.save(post);
    }

    public List<post> getAllPostFromLead(Long lead_id) throws UserDoesNotExistException {
        if (userRepository.findById(lead_id) == null){
            throw new UserDoesNotExistException("No such user exists");
        }
        return postRepository.findAllByLead_id(lead_id);
    }

    public void changePost(Long post_id) throws NoSuchPostExists {
        if (postRepository.findById(post_id) == null){
            throw new NoSuchPostExists("No such post exist");
        }
//        post posts = new post();
//        posts = postRepository.findById(post_id);


    }

    public void deletePost(Long post_id) throws NoSuchPostExists {
        if (postRepository.findById(post_id) == null){
            throw new NoSuchPostExists("No such post exists");
            post postDel = postRepository.findById(post_id);
            postRepository.delete(postDel);
        }
    }
}
