package com.taskKjssCosmos.jpamapping.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jobroles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JobRoles {


    @Id
    private long jobId;
    private String jobName;
    private int experience;
    private String location;

    @ManyToOne
    @JoinColumn(name = "depId")
    private Department department;


    @OneToMany(mappedBy = "jobRoles",cascade = CascadeType.ALL)
    private List<Application> applicationList = new ArrayList<>();



}
