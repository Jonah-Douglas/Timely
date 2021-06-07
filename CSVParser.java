import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class CSVParser {
    public static int parseFileFromWeb() throws FileNotFoundException, IOException {
        String pathToCSV = "452-2020-11-23-stop-delivery-report.csv";
        String row;
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCSV));

        while ((row = csvReader.readLine()) != null) {
            System.out.println(row);
        }

        csvReader.close();

        return 0;
    }
}
