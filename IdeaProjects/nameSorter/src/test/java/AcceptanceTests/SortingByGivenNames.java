package AcceptanceTests;
import org.example.NameSorter;
import org.junit.Test;
import static org.junit.Assert.*;


public class SortingByGivenNames {

    @Test
    public void testSortingByGivenNames() {
        // Given
        String[] unsortedNames = {"Marin Alvarez", "Adonis Julius Archer", "Beau Tristan Bentley", "Hunter Uriah Mathew Clarke", "Leo Gardner", "Vaugh Lewis", "London Lindsey", "Mikayla Lopez", "Janet Parsons", "Frankie Conner Ritter", "Shelby Nathan Yoder"};

        // When
        NameSorter sorter = new NameSorter();
        String[] sortedNames = sorter.sortByGivenNames(unsortedNames);

        // Then
        String[] expectedSortedNames = {"Marin Alvarez", "Adonis Julius Archer", "Beau Tristan Bentley", "Hunter Uriah Mathew Clarke", "Leo Gardner", "Vaugh Lewis", "London Lindsey", "Mikayla Lopez", "Janet Parsons", "Frankie Conner Ritter", "Shelby Nathan Yoder"};
        assertArrayEquals(expectedSortedNames, sortedNames);
    }
}
