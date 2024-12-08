package com.example.Samyak.placement_interaction_system;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    boolean existsByEmail(String email); // Custom method to check if email exists
}
