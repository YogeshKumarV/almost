package com.factory.appraisal.vehiclesearchapp.service.impl;
// authorName : yogeshKumarV

import com.factory.appraisal.vehiclesearchapp.dto.ConfigCodes;
import com.factory.appraisal.vehiclesearchapp.mapper.ConfigCodesMapper;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EConfigCodes;
import com.factory.appraisal.vehiclesearchapp.repository.ConfigCodesRepo;
import com.factory.appraisal.vehiclesearchapp.service.ConfigCodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ConfigCodesServiceImpl implements ConfigCodesService {
    @Autowired
    private ConfigCodesRepo configurationCodesRepo;
    @Autowired
    private ConfigCodesMapper configCodesMapper;
    @Override
    public ConfigCodes saveConfigCodes(ConfigCodes configCodes) {
        EConfigCodes eConfigCodes=configCodesMapper.configurationCodesToEConfigurationCode(configCodes);
        eConfigCodes.setModifiedOn((java.sql.Date) new Date());
        eConfigCodes.setCreatedOn((java.sql.Date) new Date());
        EConfigCodes save = configurationCodesRepo.save(eConfigCodes);
        return configCodesMapper.eConfigurationCodesToConfigurationCode(save);
    }

    @Override
    public List<ConfigCodes> getAllConfigCodes() {

        List<EConfigCodes> all = configurationCodesRepo.findAll();
        return configCodesMapper.eConfigurationCodesToConfigurationCodes(all);
    }

    @Override
    public ConfigCodes updateEConfigCodes(long codeId, ConfigCodes configCodes) {
        EConfigCodes codes=configurationCodesRepo.findById(codeId).get();
        if(codes!=null){
            if(configCodes.getValid()!=false){
                if (configCodes.getCodeType()!=null){
                    codes.setCodeType(configCodes.getCodeType());
                }
                if (configCodes.getLongCode()!=null){
                    codes.setLongCode(configCodes.getLongCode());
                }
                if (configCodes.getShortCode()!=null){
                    codes.setShortCode(configCodes.getShortCode());
                }
                if (configCodes.getShortDescription()!=null) {
                    codes.setShortDescription(configCodes.getShortDescription());
                }
                codes.setCreatedBy(configCodes.getCreatedBy());
                codes.setCreatedOn((java.sql.Date) new Date());
                codes.setModifiedBy(configCodes.getModifiedBy());
                codes.setModifiedOn((java.sql.Date) new Date());
            }
        }
        EConfigCodes save = configurationCodesRepo.save(codes);
        return configCodesMapper.eConfigurationCodesToConfigurationCode(save);
    }

    @Override
    public String removeEConfigCodes(long codeId) {
        configurationCodesRepo.deleteByCodeId(codeId);
        return "Deleted";
    }
}
