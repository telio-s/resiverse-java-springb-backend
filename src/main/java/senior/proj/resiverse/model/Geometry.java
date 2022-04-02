package senior.proj.resiverse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
public class Geometry {
    private String lat;
    private String lng;
}
