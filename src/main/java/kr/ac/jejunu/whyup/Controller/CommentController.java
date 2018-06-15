package kr.ac.jejunu.whyup.Controller;

import kr.ac.jejunu.whyup.Repository.CommentRepository;
import kr.ac.jejunu.whyup.Model.Comment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    CommentRepository commentRepository;

    @GetMapping("/list/search")
    public List get(@RequestParam(defaultValue = "-1") Integer productId,
                    @RequestParam(defaultValue = "null") String userId) {
        List<Comment> result = null;
        result = commentRepository.findAllByComment(issue_id);
        return result;
    }

}
