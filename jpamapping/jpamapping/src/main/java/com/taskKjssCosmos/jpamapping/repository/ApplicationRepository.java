package com.taskKjssCosmos.jpamapping.repository;

import com.taskKjssCosmos.jpamapping.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Long> {
}
