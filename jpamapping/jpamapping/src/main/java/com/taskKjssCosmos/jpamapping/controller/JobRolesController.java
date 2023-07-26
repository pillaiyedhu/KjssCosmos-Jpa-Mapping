package com.taskKjssCosmos.jpamapping.controller;


import com.taskKjssCosmos.jpamapping.dto.request.JobRolesRequestDto;
import com.taskKjssCosmos.jpamapping.entity.Department;
import com.taskKjssCosmos.jpamapping.entity.JobRoles;
import com.taskKjssCosmos.jpamapping.repository.JobRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRolesController {

    @Autowired
    private JobRolesRepository jobRolesRepository;

    @PostMapping("/jobrole")
    public JobRoles postJobRole(@RequestBody JobRoles jobRoles){
        return jobRolesRepository.save(jobRoles);

    }

    @GetMapping("/jobroles")
    public List<JobRoles> getJobRoles(){
        return jobRolesRepository.findAll();

    }
    @DeleteMapping("/jobrole")
    public String deleteJobRoles(@RequestBody JobRoles jobRoles){
        jobRolesRepository.delete(jobRoles);
        return "Deleted Successfully";

    }

}
