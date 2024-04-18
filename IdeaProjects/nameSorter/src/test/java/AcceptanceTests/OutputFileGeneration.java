package AcceptanceTests;
import org.example.NameSorter;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

public class OutputFileGeneration {

    @Test
    public void testOutputFileGeneration() {
        // Given
        String inputFile = "unsorted-names-list.txt";

        // When
        NameSorter sorter = new NameSorter();
        sorter.sortAndSaveToFile(inputFile);

        // Then
        File outputFile = new File("sorted-names-list.txt");
        assertTrue(outputFile.exists());
        // Additional assertions can be made about the contents of the output file
    }
}
