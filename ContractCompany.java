// FedEx Contract Company                                  |   Hammer Delivery Inc.
//     Company ID: ########                                |   12345678
//     FedEx Stations: #### (List)                         |   0982/ Null/ Null...
import java.util.*;


public class ContractCompany {
    String contractorName;
    String contractCompanyName;
    int contractCompanyNumber;
    Station station;

    // List<Road> roads;               //indices correspond to roadMap indices so roadMap only contains time from one road to another
    // double[][] roadMap;             //2d array that contains approximate time for driver to go from a given road to another


//Constructor
    public ContractCompany(String cName, String companyName, int cNumber) {
        contractorName = cName;
        contractCompanyName = companyName;
        contractCompanyNumber = cNumber;
    }
}
