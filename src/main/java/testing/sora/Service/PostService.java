package testing.sora.Service;

import org.springframework.stereotype.Service;
import testing.sora.Model.lead;
import testing.sora.Model.post;
import testing.sora.Repository.PostRepository;
import testing.sora.Repository.UserRepository;

import java.util.List;
import java.util.Map;

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

    public List<post> getAllPostFromUser(String AuthorNickname) throws Exception {
        if (postRepository.findByAuthornickname(AuthorNickname) == null){
            throw new Exception("This user does not have post");
        }
        List<post> postsFromUser = List.copyOf(postRepository.findAllByAuthornickname(AuthorNickname));
        return postsFromUser;
    }
}
