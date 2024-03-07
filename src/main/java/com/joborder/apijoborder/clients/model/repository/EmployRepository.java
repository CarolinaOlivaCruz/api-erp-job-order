package com.joborder.apijoborder.clients.model.repository;

import com.joborder.apijoborder.clients.model.entity.Employ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployRepository extends JpaRepository<Employ, Integer> {
}
