import com.opencsv.CSVWriter;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int year;
        int month;
        int day;
        // Change the path to yours
        String path = "C://Users//User//Desktop//testFile.csv";
        ArrayList<String[]> records = new ArrayList<>();
        String[] record;
        for(int i =0;i<1000;i++)
        {
            record = new String[6];
            record[0] = RandomStringUtils.randomAlphabetic(5,8);
            record[1] = RandomStringUtils.randomAlphabetic(5,10);
            year = (int)(Math.random()*120+1900);
            month = (int)(Math.random()*12+1);
            day = (int)(Math.random()*31+1);
            String date = day + "/" + month + "/" + year;
            record[2] = date;
            record[3] = RandomStringUtils.randomAlphabetic(5,8);
            record[4] = ("0" + RandomStringUtils.randomNumeric(8));
            record[5] = (RandomStringUtils.randomAlphabetic(5,10) +
                    "@" + RandomStringUtils.randomAlphabetic(4,7) + ".com");
            records.add(record);
        }
        try (CSVWriter writer = new CSVWriter(new FileWriter(path))){
            writer.writeAll(records);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
