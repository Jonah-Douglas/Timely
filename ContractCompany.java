// FedEx Contract Company                                  |   Hammer Delivery Inc.
//     Company ID: ########                                |   12345678
//     FedEx Stations: #### (List)                         |   0982/ Null/ Null...
import java.util.*;

public class ContractCompany {
    String contractorName;
    String contractCompanyName;
    int contractCompanyNumber;
    ArrayList<Station> stations;


//Constructor
    public ContractCompany(String cName, String companyName, int cNumber) {
        contractorName = cName;
        contractCompanyName = companyName;
        contractCompanyNumber = cNumber;
        stations = new ArrayList<Station>();
    }
}
