package com.factory.appraisal.vehiclesearchapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppraisalVehicleInteriorCondition extends TransactionEntityDto {



    private Long interiorConditionId ;
    private AppraisalTestDriveStatus vehicleStatusId;
    @NotNull
    private boolean cleanFrontlineReady;
    @NotNull
    private boolean goodMinorRepairsNeeded;
    @NotNull
    private boolean smokersCar;
    @NotNull
    private boolean oddSmelling;
    @NotNull
    private boolean veryDirty;
    @NotNull
    private boolean strongPetSmell;
    @NotNull
    private boolean driversSeatWear;
    @NotNull
    private boolean headlinearNeedReplacement;
    @NotNull
    private boolean driverSeatRipped;

    @NotNull
    private boolean dashCrackedMinor;
    @NotNull
    private boolean dashCrackedBrokenMajor;
    @NotNull
    private boolean passengerSeatRipped;
    @NotNull
    private boolean carpetBadlyWorn;
    @NotNull
    private boolean interiorTrimBrokenMissing;
    @NotNull
    private boolean poorNeedsRepair;



}

