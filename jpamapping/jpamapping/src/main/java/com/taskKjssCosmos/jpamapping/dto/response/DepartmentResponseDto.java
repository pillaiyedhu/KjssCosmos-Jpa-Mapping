package com.taskKjssCosmos.jpamapping.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DepartmentResponseDto {
    private long depId;
    private String depName;
}
