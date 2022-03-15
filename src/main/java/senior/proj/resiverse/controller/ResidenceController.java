package senior.proj.resiverse.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import senior.proj.resiverse.model.Residence;
import senior.proj.resiverse.services.ResidenceService;

import java.util.List;

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

    @GetMapping("/all")
    public List<Residence> getAllResidence() {
        return residenceService.getAllResidence();
    }

    @GetMapping("/{id}")
    public Residence getResidence(@PathVariable(value = "id") String id) {
        return residenceService.getResidenceById(id);
    }
    
    @PutMapping("/{id}")
    public String updateResidence(@PathVariable(value = "id") String id,@RequestBody Residence residence){
        try {
            residenceService.updateResidence(id, residence);
        }catch (IllegalStateException illegalStateException) {
            return illegalStateException.getMessage();
        }
        return "Update successfully";
    }

}
