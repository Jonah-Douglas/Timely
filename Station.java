// FedEx Station ID                                        |   0982
//         Station Address                                 |   2000 S Walnut St, Burlington, WA 98233/ Null/ Null...
//         Driver List                                     |   Jonah Douglas (18/hr., 8114646, 81313, Multiple, Multiple)/ Jay Burger...
//         --Routes List                                   |   0452, 2, 120, (115, 138, 104...), 713560/ Null/ Null...
import java.util.*;


public class Station {
    int stationNumber;
    String stationAddress;
    ArrayList<Driver> drivers;

    List<Road> roads;               //indices correspond to roadMap indices so roadMap only contains time from one road to another
    double[][] roadMap;             //2d array that contains approximate time for driver to go from a given road to another

//Constructor
    public Station(int sNumber, String sAddress) {
        stationNumber = sNumber;
        stationAddress = sAddress;
        drivers = new ArrayList<Driver>();
        
        roads = Arrays.asList(new Road[100]);
        roadMap = new double[100][100];
    }
}
