package testing.sora.Rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.sora.Model.post;
import testing.sora.Service.PostService;

@RestController
@RequestMapping("/main")
public class PostController {
    private PostService postService;
    public PostController(PostService postService){
        this.postService = postService;
    }
    @PostMapping("/newpost")
    public ResponseEntity createPost(@RequestBody post post) throws Exception {
        return ResponseEntity.ok(postService.createPost(post));
    }

    @GetMapping("/Post/getAll")
    public ResponseEntity getAllPost(@RequestParam String AuthorNickname) throws Exception {
        return ResponseEntity.ok(postService.getAllPostFromUser(AuthorNickname));
    }
}
