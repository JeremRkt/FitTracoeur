package fr.dev.fitracoeur.repository;

import fr.dev.fitracoeur.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
