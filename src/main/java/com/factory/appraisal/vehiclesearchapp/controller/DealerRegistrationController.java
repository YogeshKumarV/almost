package com.factory.appraisal.vehiclesearchapp.controller;
// authorName :

import com.factory.appraisal.vehiclesearchapp.dto.DealerRegistration;
import com.factory.appraisal.vehiclesearchapp.service.DealerRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dealerregistration")
public class DealerRegistrationController {
    @Autowired
    private DealerRegistrationService dealerRegistrationService;
    @PostMapping("/post")
    public ResponseEntity<DealerRegistration>postDealerRegistration
            (@RequestBody DealerRegistration dealerRegistration){
        return new ResponseEntity<>(dealerRegistrationService.saveDealerRegistration(dealerRegistration),HttpStatus.OK);
    }
    @GetMapping("/showall")
    public ResponseEntity<List<DealerRegistration>>showAllDealerRegistration(){
        return new ResponseEntity<>(dealerRegistrationService.getAllDealerRegistration(),HttpStatus.OK);
    }
    @PutMapping("/upgrade")
    public ResponseEntity<DealerRegistration>changeDealerRegistration
            (@PathVariable long dealerId,@RequestBody DealerRegistration dealerRegistration){
        return new ResponseEntity<>(dealerRegistrationService.updateDealerRegistration(dealerId,dealerRegistration),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String>deleteDealerRegistration(long dealerId){
        return new ResponseEntity<>(dealerRegistrationService.removeDealerRegistration(dealerId),
                HttpStatus.OK
        );
    }

}
