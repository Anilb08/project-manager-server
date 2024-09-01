package com.prjmng.service;

import com.prjmng.exception.IssueException;
import com.prjmng.exception.UserException;
import com.prjmng.model.Comment;

import java.util.List;

public interface CommentService {
    Comment createComment(Long issueId,Long userId,String comment) throws UserException, IssueException;

    void  deleteComment(Long commentId, Long userId) throws UserException, IssueException;

    List<Comment> findCommentByIssueId(Long issueId);

}
