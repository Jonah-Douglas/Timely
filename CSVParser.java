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
            getRoadDataFromRow(row);
        }

        csvReader.close();

        return 0;
    }

    public static void getRoadDataFromRow(String row) {
        StringBuilder sb = new StringBuilder();
        String roadName;
        int roadZipCode;

        for (int i = 0; i < row.length(); i++) {
            if (row.charAt(i) =='\"') {
                i++;
                while (row.charAt(i) != ',') {
                    if (Character.isLetter(row.charAt(i)) || row.charAt(i) == ' ') {
                        sb.append(row.charAt(i));
                    }
                    i++;
                }
                sb.deleteCharAt(0);
                roadName = sb.toString();
                //System.out.println(roadName);                               // contains road name
                sb = new StringBuilder();
                //TODO: check if road name is already a road, if not create new and grab zip code, otherwise update tally
            } else if (Character.isDigit(row.charAt(i))) {
                while (Character.isDigit(row.charAt(i))) {
                    sb.append(row.charAt(i));
                    i++;
                }
                roadZipCode = Integer.parseInt(sb.toString());
                //System.out.println(roadZipCode);                            // contains road address
                return;
            }
        }
    }
}
