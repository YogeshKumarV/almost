package com.factory.appraisal.vehiclesearchapp.repository;

import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalVehicleTireCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ApprasialVehicleTireConditionRepo extends JpaRepository<EAppraisalVehicleTireCondition,Long> {
}
