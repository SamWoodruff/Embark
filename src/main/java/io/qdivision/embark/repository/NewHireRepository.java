package io.qdivision.embark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.qdivision.embark.model.NewHireEntity;

public interface NewHireRepository extends JpaRepository<NewHireEntity, Long> {

}