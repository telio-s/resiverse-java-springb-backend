package senior.proj.resiverse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
public class Address {
    private String addrHouseNo;
    private String addrSubDistrict;
    private String addrDistrict;
    private String addrProvince;
    private String addrPostNum;
}
