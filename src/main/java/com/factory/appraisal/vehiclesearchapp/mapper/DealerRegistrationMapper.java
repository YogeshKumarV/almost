package com.factory.appraisal.vehiclesearchapp.mapper;

// authorName : YogeshKumarV

import com.factory.appraisal.vehiclesearchapp.dto.DealerRegistration;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EDealerRegistration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DealerRegistrationMapper {
    @Mapping(target = "configCodes",source = "configCodes")
    DealerRegistration eDealerRegisterationToDealerRegisteration(EDealerRegistration eDealerRegistration);
    @Mapping(target = "configCodes",source = "configCodes")
    EDealerRegistration dealerRegisterationToEDealerRegisteration(DealerRegistration dealerRegistration);
    List<DealerRegistration>eDealerRegisterationsToDealerRegisterations(List<EDealerRegistration>eDealerRegistrations);

}
