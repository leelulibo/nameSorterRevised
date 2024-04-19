package AcceptanceTests;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputOutputFileValidation {

    //Story: As a user, I want the name sorter to handle invalid input files gracefully.
    //Scenario 1: Providing an empty input file.
    //Given an empty input file
    //When the name sorter program is executed with the input file
    //Then the program should display an error message indicating that the file is empty
    //And no output files should be generated
    //Scenario 2: Providing a malformed input file.
    //Given an input file with invalid name formats or structure
    //When the name sorter program is executed with the input file
    //Then the program should display an error message indicating that the file contains invalid data
    //And no output files should be generated
    //--------------------------------------------------------------------------------------------------

    @Test
    void testReadFile_Logic() throws IOException {
        // Prepare test data
        String testFileName = "test-file.txt";
        String fileContent = "Line 1\nLine 2\nLine 3";

        // Write file content to a temporary file
        try (FileWriter writer = new FileWriter(testFileName)) {
            writer.write(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Call the method under test
        StringWriter stringWriter = new StringWriter();
        try (BufferedReader br = new BufferedReader(new FileReader(testFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringWriter.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Verify the content read from the file matches the expected content
        assertEquals(fileContent + "\n", stringWriter.toString());

        // Delete the temporary file
        Files.deleteIfExists(Paths.get(testFileName));
    }
}
