package com.factory.appraisal.vehiclesearchapp.service;

import com.factory.appraisal.vehiclesearchapp.dto.DealerRegistration;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EDealerRegistration;

import java.util.List;

public interface DealerRegistrationService {
    DealerRegistration saveDealerRegistration(DealerRegistration dealerRegistration);
    List<DealerRegistration> getAllDealerRegistration();
    DealerRegistration updateDealerRegistration(long dealerId,DealerRegistration dealerRegistration);
    String removeDealerRegistration(long dealerId);
}
