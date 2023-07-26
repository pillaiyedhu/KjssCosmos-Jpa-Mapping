package com.taskKjssCosmos.jpamapping.repository;

import com.taskKjssCosmos.jpamapping.entity.JobRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRolesRepository extends JpaRepository<JobRoles,Long> {
}
