import java.util.*;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LoadBalancer {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        ContractCompany contractCompany;
        String contractorName;
        String contractCompanyName;
        int contractCompanyNumber;
        Scanner scanner = new Scanner(System.in);

        welcomeMessage();
        CSVParser.parseFileFromWeb();

        /*
        System.out.println("Contractor Name: ");
        contractorName = scanner.nextLine();
        System.out.println("\nCompany Name: ");
        contractCompanyName = scanner.nextLine();
        System.out.println("\nCompany Number: ");
        contractCompanyNumber = scanner.nextInt();

        contractCompany = new ContractCompany(contractorName, contractCompanyName, contractCompanyNumber);

        //connect Stations to contract company and fill in station data
        Station station = new Station(996, "1100 South Burlington Dr.");
        contractCompany.stations.add(station);
        System.out.println(contractCompany.stations.get(0).stationAddress);             //acesses station address in Station.java
        Driver newDriver = new Driver("Jonah",18.00,8114646,18313,711464);
        contractCompany.stations.get(0).drivers.add(newDriver);
        System.out.println(contractCompany.stations.get(0).drivers.get(0).driverName);  //access drivers name in Driver.java
        Route route = new Route(452,540.00,3.14,46.32,113,711560);
        contractCompany.stations.get(0).drivers.get(0).routes.add(route);
        System.out.println(contractCompany.stations.get(0).drivers.get(0).routes.get(0).averageTotalTime); //access avestoptime in Route
        */

        //TODO: parse FedEx CSV file and create 2d array with aossicated road array
            //also need to ensure proper access via public and private methods

        scanner.close();
    }

    private static void welcomeMessage() {
        System.out.println("\n\n-----------------------------------------------FedEx Load Balancer------------------------"  +
            "-----------------\n"                                                                                            +
            "Created by Jonah Douglas\n\n"                                                                                   +
            "** Legal Disclaimer: Load Balancer provides estimates and suggestions for optimal route splits, it does **\n"   +
            "** not provide exact estimates, and is intended for use alongside other tools such as GroundCloud.      **\n\n" +
            "For questions on use or feedback on software, Jonah may be reached at jonah.douglas23@gmail.com or for\n"       +
            "immediate assistance via phone at 360-201-5070.\n"                                                              +
            "----------------------------------------------------------------------------------------------------------\n\n");
    }
}