package kr.ac.jejunu.whyup;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {
    public static final String PATH = "/api/user";
    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void get() {
        Integer id = 1;
        String userid = "ojlee";
        String password = "1234";

        User user = restTemplate.getForObject(PATH + "/" + id, User.class);
        assertThat(user.getId(), is(id));
        assertThat(user.getUserid(), is(userid));
        assertThat(user.getPassword(), is(password));
    }


}
