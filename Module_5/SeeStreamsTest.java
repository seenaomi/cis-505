package Module_5;

import java.util.Random;
import java.io.*;
/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
    Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by N. See 2021
*/

public class SeeStreamsTest {

    public static void main(String[] args) throws IOException {
        // Write a program to create a new file titled data.file
        File file = new File("data.info");

        try (FileWriter writer = new FileWriter(file, true)) {
            /*
            Write to the new file, adding 10 randomly generated numbers, 
            or append 10 randomly generated numbers to a previous file
            */
            Random random = new Random();
            for (int i = 0; i < 9; i++) {
                Integer num = random.nextInt(1000);
                // Each integer is to be separated by a space
                writer.write(num + " ");
            }
            // Close file
            writer.close();

            // Reopen file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            // Read the data from the file
            String currentLine = reader.readLine();
            // Display it
            System.out.println(currentLine);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end main

} //end SeeStreamsTest class
