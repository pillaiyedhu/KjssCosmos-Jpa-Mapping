package com.taskKjssCosmos.jpamapping.controller;


import com.taskKjssCosmos.jpamapping.dto.request.DepartmentRequestDto;
import com.taskKjssCosmos.jpamapping.entity.Department;
import com.taskKjssCosmos.jpamapping.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;




    @PostMapping("/department")
    public Department postDepartment(@RequestBody Department department){
        return departmentRepository.save(department);

    }

    @GetMapping("/departments")
    public List<Department> getDepartment(){
        return departmentRepository.findAll();

    }
    @DeleteMapping("/department")
    public String deleteDepartment(@RequestBody Department department){
        departmentRepository.delete(department);
        return "Deleted Successfully";

    }

}


