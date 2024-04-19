package UnitTests;
import org.example.SortNames;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortNamesTest {

    @Test
    void testSortNames() {
        String inputFileName = "libs/unsorted-names-list.txt";
        String outputFileName = "libs/sorted-names-list.txt";

        List<String> names = readNamesFromFile(inputFileName);

        // Expected sorted order
        List<String> expectedSortedNames = readNamesFromFile(outputFileName);

        // Sort the names
        SortNames sorter = new SortNames();
        sorter.sortNames(names);

        // Assert the sorted names
        assertEquals(expectedSortedNames.size(), names.size());
        for (int i = 0; i < expectedSortedNames.size(); i++) {
            assertEquals(expectedSortedNames.get(i), names.get(i));
        }
    }

    private List<String> readNamesFromFile(String fileName) {
        List<String> names = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }
}
