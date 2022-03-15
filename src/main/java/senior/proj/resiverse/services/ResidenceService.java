package senior.proj.resiverse.services;

import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import senior.proj.resiverse.Repository.ResidenceRepository;
import senior.proj.resiverse.model.Residence;

import java.util.List;
import java.util.Optional;

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

    public void updateResidence(String id,Residence residence){
        Optional<Residence> residenceDB = repository.findById(id);
        if(residenceDB.isPresent()){
            residence.setName(residence.getName() == null ? residenceDB.get().getName() : residence.getName());
            residence.setPhone(residence.getPhone() == null ? residenceDB.get().getPhone() : residence.getPhone());
            residence.setResidenceType(residence.getResidenceType() == null ? residenceDB.get().getResidenceType() : residence.getResidenceType());
            residence.setFloor(residence.getFloor() == null ? residenceDB.get().getFloor() : residence.getFloor());
            residence.setDescription(residence.getDescription() == null ? residenceDB.get().getDescription() : residence.getDescription());
            residence.setLine(residence.getLine() == null ? residenceDB.get().getLine() : residence.getLine());
            residence.setImageURL(residence.getImageURL() == null ? residenceDB.get().getImageURL() : residence.getImageURL());
            residence.setImagesURL(residence.getImagesURL() == null ? residenceDB.get().getImagesURL() : residence.getImagesURL());
        }
        else {
            throw new IllegalStateException("Residence not found.");
        }
    }


}
