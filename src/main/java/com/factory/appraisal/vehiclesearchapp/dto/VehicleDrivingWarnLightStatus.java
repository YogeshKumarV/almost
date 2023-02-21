package com.factory.appraisal.vehiclesearchapp.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDrivingWarnLightStatus extends TransactionEntityDto{
    private Long warningLightStatusId;
    private AppraisalTestDriveStatus appraiseStatusId;
    @NotNull
    private boolean noFaults;
    @NotNull
    private boolean absLight;
    @NotNull
    private boolean airBagFault;
    @NotNull
    private boolean batteryFault;
    @NotNull
    private boolean brakeSystem;
    @NotNull
    private boolean brakePadWear;
    @NotNull
    private boolean chargingSystem;
    @NotNull
    private boolean coolantLevel;
    @NotNull
    private boolean coolantTemp;
    @NotNull
    private boolean checkEngineLight;
    @NotNull
    private boolean oilPressure;
    @NotNull
    private boolean serviceEngineSoon;
    @NotNull
    private boolean steeringFaults;
    @NotNull
    private boolean suspensionSystem;
    @NotNull
    private boolean tractionControl;
    @NotNull
    private boolean transmissionFault;
    @NotNull
    private boolean dieselExhaustFluidLight;
    @NotNull
    private boolean dieselParticulateFilter;

}
