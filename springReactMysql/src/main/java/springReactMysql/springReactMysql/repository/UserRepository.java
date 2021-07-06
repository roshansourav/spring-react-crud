package springReactMysql.springReactMysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springReactMysql.springReactMysql.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByStudentId(String studentId);
}
