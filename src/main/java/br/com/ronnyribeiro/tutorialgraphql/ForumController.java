package br.com.ronnyribeiro.tutorialgraphql;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ForumController {
    @Autowired
    PostService postService;

    @Autowired
    CommentService commentService;

    public Post postById(String id) {
        return postService.postById(id);
    }

    public Collection<Post> createPost(String content) {
        return postService.createPost(content);
    }

    public Collection<Comment> createComment(String content, String postId) {
        return commentService.createComment(content, postId);
    }
}
