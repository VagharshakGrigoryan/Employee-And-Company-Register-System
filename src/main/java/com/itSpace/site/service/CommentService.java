package com.itSpace.site.service;

import com.itSpace.site.model.Comment;
import com.itSpace.site.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public List<Comment> getAllCommentsByPostId(int id) {
        return commentRepository.findAllByPost_Id(id);
    }

    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }
}