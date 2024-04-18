package UnitTests;

import org.example.GivenNames;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GivenNamesTest {

    @Test
    public void testGivenNamesSorting() {
        // Prepare unsorted names
        List<String> unsortedNames = readNamesFromFile("libs/unsorted-names-list.txt");

        // Expected sorted order
        List<String> expectedSortedNames = readNamesFromFile("libs/sorted-names-list.txt");

        // Sort the names
//        GivenNames.sortNames(unsortedNames);

        // Assert the sorted names
        assertEquals(expectedSortedNames.size(), unsortedNames.size());
        for (int i = 0; i < expectedSortedNames.size(); i++) {
            assertEquals(expectedSortedNames.get(i), unsortedNames.get(i));
        }
    }

    private List<String> readNamesFromFile(String fileName) {
        List<String> names = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                names.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return names;
    }
}
