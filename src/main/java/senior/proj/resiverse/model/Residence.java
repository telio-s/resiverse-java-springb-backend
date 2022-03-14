package senior.proj.resiverse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@AllArgsConstructor
public class Residence {
    @Id
    private String id;
    private String name;
    private String phone;
    private Address address;
    private ResidenceType residenceType;
    private String floor;
    private List<Facility> facilities;
    private List<Room> room;
    private String description;
    private String website;
    private String line;
}
