package com.factory.appraisal.vehiclesearchapp.mapper;
// authorName : YogeshKumarV


import com.factory.appraisal.vehiclesearchapp.dto.ConfigCodes;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EConfigCodes;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ConfigCodesMapper {
    ConfigCodes eConfigurationCodesToConfigurationCode(EConfigCodes eConfigCodes);
    EConfigCodes configurationCodesToEConfigurationCode(ConfigCodes configCodes);
    List<ConfigCodes> eConfigurationCodesToConfigurationCodes(List<EConfigCodes> eConfigCodes);
}
