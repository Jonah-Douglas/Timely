# Timely
Program to balance loads for FedEx Delivery Drivers, removing need for midday transfers, saving time, money and wear on delivery trucks.

Composition:                                            |   Example Company
------------------------------------------------------------------------------------------------
FedEx Contract Company                                  |   Hammer Delivery Inc.
    Company ID: ########                                |   12345678
    FedEx Stations: #### (List)                         |   0982/ Null/ Null...


    FedEx Station                                       |   0982
        Station Address                                 |   2000 S Walnut St, Burlington, WA 98233/ Null/ Null...
        Driver List                                     |   Jonah Douglas (18/hr., 8114646, 81313, Multiple, Multiple)/ Jay Burger...
        Routes List                                     |   0452, 2, 120, (115, 138, 104...), 713560/ Null/ Null...

        *Subsection to FedEx Station
        Drivers: Name, Salary, badge number, gas card, truck numbers, route names (Example Above, Driver List)
            average total time on each route            |   8.5 hours
            average total time at station               |   1 hour
            average stop time on each route             |   2.81 minutes
            time to route/time from each route to hub   |   57 minutes
            flag tally count                            |   0

        routes: 
            route number                                |   0452
            drivers on route                            |   2
            average package count (store totals per day to create a working history)    |   120
            total package count history                 |   115 M, 138 T, 104 W
            truck number on route                       |   713560