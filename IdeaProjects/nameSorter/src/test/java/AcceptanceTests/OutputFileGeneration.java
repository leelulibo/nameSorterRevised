package AcceptanceTests;

import org.example.GivenNames;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.Collections;

public class OutputFileGeneration {

    //Output File Validation:
    //Story: As a user, I want the name sorter to generate a file containing the sorted names.
    //Scenario 1: Generating a sorted output file.
    //Given a list of unsorted names
    //When the name sorter program is executed with the input file
    //Then a file named "sorted-names-list.txt" should be created in the working directory
    //And the file should contain the sorted names in the correct order

    @Test
    public void testOutputFileGeneration() {
        // Given
        String inputFile = "unsorted-names-list.txt";

        // When
        GivenNames sorter = new GivenNames();
        sorter.sortNames(Collections.singletonList(inputFile));

        // Then
        File outputFile = new File("sorted-names-list.txt");
        assertTrue(outputFile.exists());
        // Additional assertions can be made about the contents of the output file
    }
}
