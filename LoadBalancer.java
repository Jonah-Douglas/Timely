import java.util.*;

public class LoadBalancer {
    public static void main(String[] args) {
        ContractCompany contractCompany;
        String contractorName;
        String contractCompanyName;
        int contractCompanyNumber;
        Scanner scanner = new Scanner(System.in);

        welcomeMessage();
        System.out.println("Contractor Name: ");
        contractorName = scanner.nextLine();
        System.out.println("\nCompany Name: ");
        contractCompanyName = scanner.nextLine();
        System.out.println("\nCompany Number: ");
        contractCompanyNumber = scanner.nextInt();

        contractCompany = new ContractCompany(contractorName, contractCompanyName, contractCompanyNumber);

        scanner.close();
    }

    public static void welcomeMessage() {
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