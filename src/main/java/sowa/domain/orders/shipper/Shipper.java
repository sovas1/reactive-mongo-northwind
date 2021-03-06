package sowa.domain.orders.shipper;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import sowa.common.DomainModel;

@Document(collection = "shippers")
@TypeAlias("shipper")
public class Shipper extends DomainModel {

    public String companyName;
    public String phone;

}