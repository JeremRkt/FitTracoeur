package fr.dev.fitracoeur.repository;

import fr.dev.fitracoeur.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {
}
