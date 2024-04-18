package AcceptanceTests;

import org.example.NameSorter;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class HandlingMultipleGivenNames {

    @Test
    public void testHandlingMultipleGivenNames() throws IOException {
        // Given
        String[] unsortedNames = Files.readAllLines(Paths.get("C:\\Users\\CAPACITI\\nameSorter\\IdeaProjects\\nameSorter\\src\\main\\java\\org\\example\\unsorted-names-list.txt")).toArray(new String[0]);

        // When
        NameSorter sorter = new NameSorter();
        String[] sortedNames = sorter.sortByMultipleGivenNames(unsortedNames);

        // Then
        String[] expectedSortedNames = Files.readAllLines(Paths.get("C:\\Users\\CAPACITI\\nameSorter\\IdeaProjects\\nameSorter\\src\\main\\java\\org\\example\\unsorted-names-list.txt")).toArray(new String[0]);
        Arrays.sort(expectedSortedNames); // Sorting the expected names array
        assertArrayEquals(expectedSortedNames, sortedNames);
    }
}
