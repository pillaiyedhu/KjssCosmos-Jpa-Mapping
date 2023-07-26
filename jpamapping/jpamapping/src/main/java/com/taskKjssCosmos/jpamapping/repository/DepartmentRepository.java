package com.taskKjssCosmos.jpamapping.repository;

import com.taskKjssCosmos.jpamapping.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
