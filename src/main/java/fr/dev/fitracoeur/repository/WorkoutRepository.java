package fr.dev.fitracoeur.repository;

import fr.dev.fitracoeur.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
