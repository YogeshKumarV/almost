package com.factory.appraisal.vehiclesearchapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import java.sql.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class TransactionEntityDto extends IdEntityDto {

    @Max(50)
    private String createdBy;


    private Date createdOn;


    @Max(50)
    private String modifiedBy;


    private Date modifiedOn;
}
