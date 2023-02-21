package com.factory.appraisal.vehiclesearchapp.controller;
// authorName : YogeshKumarV

import com.factory.appraisal.vehiclesearchapp.dto.ConfigCodes;
import com.factory.appraisal.vehiclesearchapp.mapper.ConfigCodesMapper;
import com.factory.appraisal.vehiclesearchapp.service.ConfigCodesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/congifcodes")
@Api(value = "ConfigCodesController",description = "Operations in **ConfigCodesController**")
public class ConfigCodesController {
    @Autowired
    private ConfigCodesService configCodesService;
    @Autowired
    private ConfigCodesMapper configCodesMapper;
    @ApiOperation(value = "Add Config Codes in Database")
    @PostMapping("/post")
    public ResponseEntity<ConfigCodes> postConfigurationCodes(@RequestBody ConfigCodes configCodes){
        return new ResponseEntity<>(configCodesService.saveConfigCodes(configCodes),
                HttpStatus.OK
        );
    }
    @GetMapping("/showall")
    public ResponseEntity<List<ConfigCodes>> showAllConfigurationCodes(){
        return new ResponseEntity<>(configCodesService.getAllConfigCodes(),
                HttpStatus.OK
        );
    }
    @PutMapping("/update")
    public ResponseEntity<ConfigCodes> changeEConfigurationCodes(@PathVariable long codeId, @RequestBody ConfigCodes configCodes){
        return new ResponseEntity<>(configCodesService.updateEConfigCodes(codeId,configCodes),
                HttpStatus.ACCEPTED
        );
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteEConfigurationCode(@PathVariable long codeId){
        return new ResponseEntity<>(configCodesService.removeEConfigCodes(codeId),
                HttpStatus.OK
        );
    }
}
