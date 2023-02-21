package com.factory.appraisal.vehiclesearchapp.service.impl;


import com.factory.appraisal.vehiclesearchapp.dto.DealerRegistration;
import com.factory.appraisal.vehiclesearchapp.mapper.DealerRegistrationMapper;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EDealerRegistration;
import com.factory.appraisal.vehiclesearchapp.repository.DealerRegistrationRepo;
import com.factory.appraisal.vehiclesearchapp.service.DealerRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class DealerRegistrationServiceImpl implements DealerRegistrationService {
    @Autowired
    private DealerRegistrationRepo dealerRegistrationRepo;
    @Autowired
    private DealerRegistrationMapper dealerRegistrationMapper;
    @Override
    public DealerRegistration saveDealerRegistration(DealerRegistration dealerRegistration) {
        EDealerRegistration eDealerRegistration = dealerRegistrationMapper.dealerRegisterationToEDealerRegisteration(dealerRegistration);
        eDealerRegistration.setCreatedOn((java.sql.Date) new Date());
        eDealerRegistration.setModifiedOn((java.sql.Date) new Date());
        EDealerRegistration save = dealerRegistrationRepo.save(eDealerRegistration);
        return dealerRegistrationMapper.eDealerRegisterationToDealerRegisteration(save);
    }

    @Override
    public List<DealerRegistration> getAllDealerRegistration() {
        List<EDealerRegistration> all = dealerRegistrationRepo.findAll();
        return dealerRegistrationMapper.eDealerRegisterationsToDealerRegisterations(all);
    }

    @Override
    public DealerRegistration updateDealerRegistration(long dealerId, DealerRegistration dealerRegistration) {
        EDealerRegistration dealers=dealerRegistrationRepo.findById(dealerId).get();
        if (dealers!=null){
            if (dealerRegistration.getValid()!=false){
                if(dealerRegistration.getName()!=null){
                    dealers.setName(dealerRegistration.getName());
                }
                if ((dealerRegistration.getFirstName() != null)) {
                    dealers.setFirstName(dealerRegistration.getFirstName());
                }
                if(dealerRegistration.getLastName()!=null){
                    dealers.setLastName(dealerRegistration.getLastName());
                }
                if (dealerRegistration.getApartmentNumber()!=null){
                    dealers.setApartmentNumber(dealerRegistration.getApartmentNumber());
                }
                if (dealerRegistration.getCity()!=null){
                    dealers.setCity(dealerRegistration.getCity());
                }
                if (dealerRegistration.getEmail()!=null){
                    dealers.setEmail(dealerRegistration.getEmail());
                }
                if (dealerRegistration.getPassword()!=null){
                    dealers.setPassword(dealerRegistration.getPassword());
                }
                if (dealerRegistration.getPhoneNumber()!=null){
                    dealers.setPhoneNumber(dealerRegistration.getPhoneNumber());
                }
                if (dealerRegistration.getProfilePicture()!=null){
                    dealers.setProfilePicture(dealerRegistration.getProfilePicture());
                }
                if (dealerRegistration.getState()!=null){
                    dealers.setState(dealerRegistration.getState());
                }
                if (dealerRegistration.getStreetAddress()!=null){
                    dealers.setStreetAddress(dealerRegistration.getStreetAddress());
                }
                if (dealerRegistration.getZipCode()!=null){
                    dealers.setZipCode(dealerRegistration.getZipCode());
                }
                if (dealerRegistration.getLatitude()!=null){
                    dealers.setLatitude(dealerRegistration.getLatitude());
                }
                if (dealerRegistration.getLongitude()!=null){
                    dealers.setLongitude(dealerRegistration.getLongitude());
                }
                if (dealerRegistration.getTaxCertificate()!=null){
                    dealers.setTaxCertificate(dealerRegistration.getTaxCertificate());
                }
                if(dealerRegistration.getDealershipName()!=null){
                    dealers.setDealershipName(dealerRegistration.getDealershipName());
                }
                if (dealerRegistration.getDealershipAddress()!=null){
                    dealers.setDealershipAddress(dealerRegistration.getDealershipAddress());
                }
                if (dealerRegistration.getDealershipStreet()!=null){
                    dealers.setDealershipStreet(dealerRegistration.getDealershipStreet());
                }
                if (dealerRegistration.getDealershipCity()!=null){
                    dealers.setDealershipCity(dealerRegistration.getDealershipCity());
                }
                if (dealerRegistration.getDealershipZipCode()!=null){
                    dealers.setDealershipZipCode(dealerRegistration.getDealershipZipCode());
                }
                if (dealerRegistration.getDealershipPhoneNumber()!=null){
                    dealers.setDealershipPhoneNumber(dealerRegistration.getDealershipPhoneNumber());
                }
                if (dealerRegistration.getDealershipPicture()!=null){
                    dealers.setDealershipPicture(dealerRegistration.getDealershipPicture());
                }
                if (dealerRegistration.getDealershipLicense()!=null){
                    dealers.setDealershipPicture(dealerRegistration.getDealershipPicture());
                }
                if (dealerRegistration.getCorporationName()!=null) {
                    dealers.setCorporationName(dealerRegistration.getCorporationName());
                }
                if (dealerRegistration.getConfigCodes()!=null){

                }
                dealers.setCreatedBy(dealerRegistration.getCreatedBy());
                dealers.setCreatedOn((java.sql.Date) new Date());
                dealers.setModifiedBy(dealerRegistration.getModifiedBy());
                dealers.setModifiedOn((java.sql.Date) new Date());
            }
        }
        EDealerRegistration save = dealerRegistrationRepo.save(dealers);
        return dealerRegistrationMapper.eDealerRegisterationToDealerRegisteration(save);
    }

    @Override
    public String removeDealerRegistration(long dealerId) {
        dealerRegistrationRepo.deleteByDealerId(dealerId);
        return "Deleted";
    }
}
