package com.factory.appraisal.vehiclesearchapp.dto;

//@author:Rupesh khade

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppraisalVehicleAcCondition extends TransactionEntityDto {

    private Long acConditionId;

    private AppraisalTestDriveStatus vehicleStatusId;


    @NotNull
    private Boolean coldAir;
    @NotNull
    private Boolean badDisplay;
    @NotNull
    private Boolean fadedDisplayOrButtons;
    @NotNull
    private Boolean fanSpeedMalfunction;
    @NotNull
    private Boolean climateControlMalfunction;
    @NotNull
    private Boolean hotOrWarmAir;
    @NotNull
    private Boolean notOperational;


}
