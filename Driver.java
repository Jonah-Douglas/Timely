// Drivers: Name, Salary, badge number, gas card, truck numbers, route names (Example Above, Driver List)
//             average total time at station               |   1 hour
//             flag tally count                            |   0
import java.util.*;

public class Driver {
    //FedEx Driver Details
    String driverName;
    double salary;
    int fedexID;
    int gasCardNumber;
    int truckNumber;
    ArrayList<Route> routes;

    //FedEx Driver Stats
    float averageTotalTimeAtStation;
    int flagTallyCount;

    //Constructor
    public Driver(String name, double sal, int ID, int gasCard, int truckNum) {
        driverName = name;
        salary = sal;
        fedexID = ID;
        gasCardNumber = gasCard;
        truckNumber = truckNum;
        routes = new ArrayList<Route>();
    }
}
