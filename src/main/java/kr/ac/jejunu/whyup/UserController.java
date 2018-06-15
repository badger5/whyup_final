package kr.ac.jejunu.whyup;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")

public class UserController {

    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User get(@PathVariable Integer id) {
        return userRepository.findById(id).get();
    }

}
