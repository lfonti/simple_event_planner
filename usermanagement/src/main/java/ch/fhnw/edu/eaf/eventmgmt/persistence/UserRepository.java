package ch.fhnw.edu.eaf.eventmgmt.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.fhnw.edu.eaf.eventmgmt.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByLastName(String lastName);

	List<User> findByFirstName(String firstName);

	List<User> findByEmail(String email);
}
