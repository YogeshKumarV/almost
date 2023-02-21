package com.factory.appraisal.vehiclesearchapp.service.impl;

import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalVehicleTireCondition;
import com.factory.appraisal.vehiclesearchapp.repository.ApprasialVehicleTireConditionRepo;
import com.factory.appraisal.vehiclesearchapp.service.AppraisalVehicleTireConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppraisalVehicleTireConditionServiceImpl implements AppraisalVehicleTireConditionService {
    @Autowired
    private ApprasialVehicleTireConditionRepo apprasialVehicleTireConditionRepo;
    @Override
    public EAppraisalVehicleTireCondition saveAppraisalVehileTireCondition(EAppraisalVehicleTireCondition eAppraisalVehicleTireCondition) {
        return apprasialVehicleTireConditionRepo.save(eAppraisalVehicleTireCondition);
    }

    @Override
    public List<EAppraisalVehicleTireCondition> showAppraisalVehileTireCondition() {
        return apprasialVehicleTireConditionRepo.findAll();
    }

    @Override
    public EAppraisalVehicleTireCondition upgradeTireCondition(long vehicleTireConditionId, EAppraisalVehicleTireCondition eAppraisalVehicleTireCondition) {

        return null;
    }
}
