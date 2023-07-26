package com.taskKjssCosmos.jpamapping.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {


    @Id
    private long depId;
    private String depName;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    private List<JobRoles> jobRolesList = new ArrayList<>();



}
