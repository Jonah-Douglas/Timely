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
        --Routes List                                   |   0452, 0440, Null...

        *Subsection to FedEx Station
        Drivers: Name, Salary, badge number, gas card, truck numbers, route names (Example Above, Driver List)
            average total time at station               |   1 hour
            flag tally count                            |   0
            Routes List                                 |   0452, 0440, Null...

        routes: 
            route ID                                    |   0452
            drivers on route                            |   2
            average total time on each route            |   8.5 hours
            average stop time on each route             |   2.81 minutes
            time to route |                             |   57 minutes
            average package count (store totals per day to create a working history)    |   120
            total package count history                 |   115 M, 138 T, 104 W
            truck number on route                       |   713560