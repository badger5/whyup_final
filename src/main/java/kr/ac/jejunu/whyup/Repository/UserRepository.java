package kr.ac.jejunu.whyup.Repository;


import kr.ac.jejunu.whyup.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
