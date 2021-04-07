# Timely
Program to balance loads for FedEx Delivery Drivers, removing need for midday transfers, saving time, money and wear on delivery trucks.

Composition:                                            |   Example Company
------------------------------------------------------------------------------------------------
FedEx Contract Company                                  |   Hammer Delivery Inc.
    Company ID: ########                                |   12345678
    Driver List                                         |   Jonah Douglas (18/hr., 8114646, 81313, Multiple, Multiple)
    FedEx Station number: #### (List) (Paired v)        |   0982, Null, Null...
    FedEx Station address: #### String (List)           |   2000 S Walnut St, Burlington, WA 98233, Null, Null...


    *Part of FedEx Company
    Drivers: Name, Salary, badge number, gas card, truck numbers, route names (See Above, Driver List)
        average total time on route                     |   8.5 hours
        average total time at station                   |   1 hour
        average stop time                               |   2.81 minutes
        time to route/time from route to hub            |   57 minutes
        flag tally count                                |   0

    routes: 
        route number                                        |   0452
        drivers on route                                    |   2
        average package count (store totals per day to create a working history)    |   120
        total package count history                         |   115 M, 138 T, 104 W
        truck number on route                               |   713560