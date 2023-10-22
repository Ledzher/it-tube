package it.academy.ittube.repository;

import it.academy.ittube.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
 User findByUserName (String name);
}
