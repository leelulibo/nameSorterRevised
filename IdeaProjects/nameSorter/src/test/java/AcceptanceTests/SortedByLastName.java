package AcceptanceTests;

import org.example.NameSorter;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortedByLastName {

    @Test
    public void testSortingByLastName() {
        // Given
        String[] unsortedNames = new String[]{"C:\\Users\\CAPACITI\\nameSorter\\IdeaProjects\\nameSorter\\src\\main\\java\\org\\example\\unsorted-names-list.txt"};

        // When
        NameSorter sorter = new NameSorter();
        String sortedNames = Arrays.toString(sorter.sortByLastName(unsortedNames));

        // Then
        String[] expectedSortedNames = {"C:\\Users\\CAPACITI\\nameSorter\\IdeaProjects\\nameSorter\\src\\main\\java\\org\\example\\sorted-names-list.txt"};
        assertEquals(expectedSortedNames, sortedNames);
    }
}
