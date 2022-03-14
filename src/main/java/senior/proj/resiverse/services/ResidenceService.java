package senior.proj.resiverse.services;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import senior.proj.resiverse.Repository.ResidenceRepository;
import senior.proj.resiverse.model.Residence;

import java.util.List;

@Service
@AllArgsConstructor
public class ResidenceService {
    private final ResidenceRepository repository;

    public Residence findResidenceByName(String name){
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name));
        return repository.findResidenceByName(name);
    }

    public List<Residence> getAllResidence() {
        return repository.findAll();
    }

    public Residence getResidenceById(String id){
//        Residence residence = repository.findById(id).get();
//        if(residence != null){
//            return residence;
//        }else {
//            throw new IllegalStateException("id residence not found.");
//        }
        return repository.findById(id).get();
    }

    public void addResidence(Residence residence) {
        Residence residenceDB = findResidenceByName(residence.getName());
        if(residenceDB == null){
            repository.insert(residence);
        }else {
            throw new IllegalStateException(residence.getName() + " already exists.");
        }
    }


}
