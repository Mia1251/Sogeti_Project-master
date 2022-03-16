package se.sogeti.sogeti_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.sogeti.sogeti_project.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
