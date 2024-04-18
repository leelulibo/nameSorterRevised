package AcceptanceTests;
import org.example.InvalidInputFileException;
import org.example.NameSorter;
import org.junit.Test;
import static org.junit.Assert.*;

public class InputFileValidation {

    @Test
    public void testEmptyInputFile() {
        // Given
        String emptyInputFile = "empty.txt"; // Assuming an empty file

        // When
        NameSorter sorter = new NameSorter();
        String[] sortedNames = sorter.sortFromFile(emptyInputFile);

        // Then
        assertEquals(0, sortedNames.length);
    }

    @Test(expected = InvalidInputFileException.class)
    public void testMalformedInputFile() {
        // Given
        String malformedInputFile = "malformed.txt"; // Assuming a malformed file

        // When
        NameSorter sorter = new NameSorter();
        sorter.sortFromFile(malformedInputFile);

        // Then
        // Expecting InvalidInputFileException to be thrown
    }
}
