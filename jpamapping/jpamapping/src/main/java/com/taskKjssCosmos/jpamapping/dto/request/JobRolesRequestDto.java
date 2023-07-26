package com.taskKjssCosmos.jpamapping.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JobRolesRequestDto {
    private long jobId;
    private String jobName;
    private int experience;
    private String location;
    private long depId;


}
