package com.taskKjssCosmos.jpamapping.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentRequestDto {

    private long depId;
    private String depName;

}
