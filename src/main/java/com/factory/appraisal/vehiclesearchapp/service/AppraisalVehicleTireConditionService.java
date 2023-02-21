package com.factory.appraisal.vehiclesearchapp.service;

import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalVehicleTireCondition;

import java.util.List;

public interface AppraisalVehicleTireConditionService {
    EAppraisalVehicleTireCondition saveAppraisalVehileTireCondition(EAppraisalVehicleTireCondition eAppraisalVehicleTireCondition);
    List<EAppraisalVehicleTireCondition> showAppraisalVehileTireCondition();
    EAppraisalVehicleTireCondition upgradeTireCondition(long vehicleTireConditionId,EAppraisalVehicleTireCondition eAppraisalVehicleTireCondition);


}
