package senior.proj.resiverse.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import senior.proj.resiverse.model.Residence;
import senior.proj.resiverse.services.ResidenceService;

@RestController
@RequestMapping("api/residence")
@AllArgsConstructor
public class ResidenceController {
    private final ResidenceService residenceService;
    
    @PostMapping
    public String addResidence(@RequestBody Residence residence){
        try{
            residenceService.addResidence(residence);
        }catch (IllegalStateException illegalStateException){
            return illegalStateException.getMessage();
        }
        return "Success";
    }
}
