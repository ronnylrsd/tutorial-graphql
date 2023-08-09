package br.com.ronnyribeiro.tutorialgraphql;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
class ForumService {
    Map<String, Post> posts = new HashMap<>();

    Collection<Post> createPost(String content) {
        var newPost = new Post(UUID.randomUUID().toString(), content);
        posts.put(newPost.id(), newPost);
        return posts.values();
    }
}

@Service
class CommentService {
    
}
