package testing.sora.Service;

import org.springframework.stereotype.Service;
import testing.sora.Model.lead;
import testing.sora.Model.post;
import testing.sora.Repository.PostRepository;
import testing.sora.Repository.UserRepository;

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
}
