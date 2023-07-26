package com.taskKjssCosmos.jpamapping.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApplicationRequestDto {
    private long aId;
    private String name;
    private String email;
    private long phNumber;
    private int experience;
    private double currentCTC;
    private double expectedCTC;
    private String skills;
    private String coverLetter;
    private long jobId;
}
