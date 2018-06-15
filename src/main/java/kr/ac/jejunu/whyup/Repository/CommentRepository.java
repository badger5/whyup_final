package kr.ac.jejunu.whyup.Repository;

import kr.ac.jejunu.whyup.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CommentRepository {
    List<Comment> findAllByComment(int issue_id);
    Comment save(Comment comment);
}
