package AcceptanceTests;

import org.example.NameSorter;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortedByLastName {

    @Test
    public void testSortingByLastName() {
        // Given
        String[] unsortedNames = {"Janet Parsons", "Vaugh Lewis", "Adonis Julius Archer", "Shelby Nathan Yoder", "Marin Alvarez", "London Lindsey", "Beau Tristan Bentley", "Leo Gardner", "Hunter Uriah Mathew Clarke", "Mikayla Lopez", "Frankie Conner Ritter"};

        // When
        NameSorter sorter = new NameSorter();
        String[] sortedNames = sorter.sortByLastName(unsortedNames);

        // Then
        String[] expectedSortedNames = {"Marin Alvarez", "Adonis Julius Archer", "Beau Tristan Bentley", "Hunter Uriah Mathew Clarke", "Leo Gardner", "Vaugh Lewis", "London Lindsey", "Mikayla Lopez", "Janet Parsons", "Frankie Conner Ritter", "Shelby Nathan Yoder"};
        assertArrayEquals(expectedSortedNames, sortedNames);
    }
}
