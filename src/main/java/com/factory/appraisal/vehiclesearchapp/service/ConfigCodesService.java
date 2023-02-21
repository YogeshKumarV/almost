package com.factory.appraisal.vehiclesearchapp.service;

import com.factory.appraisal.vehiclesearchapp.dto.ConfigCodes;

import java.util.List;

public interface ConfigCodesService {
    ConfigCodes saveConfigCodes(ConfigCodes configCodes);
    List<ConfigCodes> getAllConfigCodes();
    ConfigCodes updateEConfigCodes(long codeId, ConfigCodes configCodes);
    String removeEConfigCodes(long codeId);

}
