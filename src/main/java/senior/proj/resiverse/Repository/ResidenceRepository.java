package senior.proj.resiverse.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import senior.proj.resiverse.model.Residence;

public interface ResidenceRepository extends MongoRepository<Residence, String> {
    Residence findResidenceByName(String name);
}
