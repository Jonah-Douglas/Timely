// routes: 
//             route ID                                    |   0452
//             drivers on route                            |   2
//             average total time on each route            |   8.5 hours
//             average stop time on each route             |   2.81 minutes
//             time to route |                             |   57 minutes
//             average package count (store totals per day to create a working history)    |   120
//             total package count history                 |   115 M, 138 T, 104 W
//             truck number on route                       |   713560
import java.util.*;

public class Route {
    int routeID;
    String[] driversOnRoute;
    float averageTotalTime;
    float averageStopTime;
    int timeToRoute;
    int averagePackageCount;
    int[] packageCountHistory;
    int truckNumberOnRoute;
}
