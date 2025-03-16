package fr.dev.fitracoeur.repository;

import fr.dev.fitracoeur.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
