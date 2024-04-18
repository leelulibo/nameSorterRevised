package AcceptanceTests;
import org.example.NameSorter;
import org.junit.Test;
import static org.junit.Assert.*;


public class HandlingMultipleGivenNames {

    @Test
    public void testHandlingMultipleGivenNames() {
        // Given
        String[] unsortedNames = {"Marin Alvarez", "Adonis Julius Archer", "Beau Tristan Bentley", "Hunter Uriah Mathew Clarke", "Leo Gardner", "Vaugh Lewis", "London Lindsey", "Mikayla Lopez", "Janet Parsons", "Frankie Conner Ritter", "Shelby Nathan Yoder"};

        // When
        NameSorter sorter = new NameSorter();
        String[] sortedNames = sorter.sortByMultipleGivenNames(unsortedNames);

        // Then
        String[] expectedSortedNames = {"Marin Alvarez", "Adonis Julius Archer", "Beau Tristan Bentley", "Hunter Uriah Mathew Clarke", "Leo Gardner", "Vaugh Lewis", "London Lindsey", "Mikayla Lopez", "Janet Parsons", "Frankie Conner Ritter", "Shelby Nathan Yoder"};
        assertArrayEquals(expectedSortedNames, sortedNames);
    }
}
