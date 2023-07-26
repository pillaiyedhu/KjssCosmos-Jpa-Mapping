package com.taskKjssCosmos.jpamapping.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "application")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Application {


    @Id
    private long aId;
    private String name;
    private String email;
    private long phNumber;
    private int experience;
    private double currentCTC;
    private double expectedCTC;
    private String skills;
    private String coverLetter;


    @ManyToOne
    @JoinColumn(name = "jobId")
    private JobRoles jobRoles;


}
