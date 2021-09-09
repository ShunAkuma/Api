package testing.sora.Rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.sora.Exception.UserDoesNotExistException;
import testing.sora.Model.post;
import testing.sora.Service.PostService;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

    @GetMapping(value = "/post/{lead_id}")
    public ResponseEntity GetAllPost(
            @NotNull
            @Size(min = 1)
            @PathVariable Long lead_id
    ) throws UserDoesNotExistException {
        return ResponseEntity.ok(postService.getAllPostFromLead(lead_id));
    }

//    @PutMapping("/change/{post_id}")
//    public ResponseEntity changePost(@PathVariable Long post_id){
//
//    }

    @DeleteMapping(value = "/delete/Post/{post_id}/delete")
    public ResponseEntity deletePost(
            @NotNull
            @Size(min = 1)
            @PathVariable Long post_id
    ){
        postService.deletePost(post_id);
        return ResponseEntity.ok("Post was be deleted");
    }
}
