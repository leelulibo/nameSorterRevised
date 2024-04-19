package AcceptanceTests;

import org.example.GivenNames;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SortByGivenName{

    @Test
    public void testSortingByGivenNames() {
        // Given
        List<String> unsortedNames = Arrays.asList("Janet Parsons", "Vaugh Lewis", "Adonis Julius Archer", "Shelby Nathan Yoder", "Marin Alvarez", "London Lindsey", "Beau Tristan Bentley", "Leo Gardner", "Hunter Uriah Mathew Clarke", "Mikayla Lopez", "Frankie Conner Ritter");
        List<String> expectedSortedNames = Arrays.asList("Marin Alvarez", "Adonis Julius Archer", "Beau Tristan Bentley", "Hunter Uriah Mathew Clarke", "Leo Gardner", "Vaugh Lewis", "London Lindsey", "Mikayla Lopez", "Janet Parsons", "Frankie Conner Ritter", "Shelby Nathan Yoder");

        // When
        GivenNames sorter = new GivenNames();
        sorter.sortNames(unsortedNames);

        // Then
        assertEquals(expectedSortedNames, unsortedNames);
    }
}
