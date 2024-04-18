package AcceptanceTests;
import org.example.NameSorter;
import org.junit.Test;
import static org.junit.Assert.*;


public class SortingByGivenNames {

    @Test
    public void testSortingByGivenNames() {
        // Given
        String[] unsortedNames = new String[]{"C:\\Users\\CAPACITI\\nameSorter\\IdeaProjects\\nameSorter\\src\\main\\java\\org\\example\\unsorted-names-list.txt"};


        // When
        NameSorter sorter = new NameSorter();
        String[] sortedNames = sorter.sortByGivenNames(unsortedNames);

        // Then
        String[] expectedSortedNames = new String[]{"C:\\Users\\CAPACITI\\nameSorter\\IdeaProjects\\nameSorter\\src\\main\\java\\org\\example\\unsorted-names-list.txt"};
        assertArrayEquals(expectedSortedNames, sortedNames);
    }
}
