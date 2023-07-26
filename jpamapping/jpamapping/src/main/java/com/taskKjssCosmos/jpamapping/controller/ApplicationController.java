package com.taskKjssCosmos.jpamapping.controller;


import com.taskKjssCosmos.jpamapping.dto.request.ApplicationRequestDto;
import com.taskKjssCosmos.jpamapping.entity.Application;
import com.taskKjssCosmos.jpamapping.entity.Department;
import com.taskKjssCosmos.jpamapping.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationRepository applicationRepository;


    @PostMapping("/application")
    public Application postApplication(@RequestBody Application application){
        return applicationRepository.save(application);

    }

    @GetMapping("/applications")
    public List<Application> getApplication(){
        return applicationRepository.findAll();

    }
    @DeleteMapping("/application")
    public String deleteApplication(@RequestBody Application application){
        applicationRepository.delete(application);
        return "Deleted Successfully";

    }
}
