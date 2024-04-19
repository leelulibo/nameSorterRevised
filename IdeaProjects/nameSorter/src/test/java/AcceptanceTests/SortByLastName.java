package AcceptanceTests;

import org.example.SortNames;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortByLastName {
    // Story: As a user, I want the name sorter to correctly sort names by their last name.
    //Scenario 1: Sorting a list of names by last name.
    //Given a list of unsorted names
    //When the name sorter program is executed with the input file
    //Then the names should be sorted alphabetically by last name
    //And the sorted names should be displayed on the screen
    //And the sorted names should be saved in a file in the working directory


    @Test
    public void testSortingByLastName() {
        // Given
        List<String> unsortedNames = Arrays.asList("Janet Parsons", "Vaugh Lewis", "Adonis Julius Archer", "Shelby Nathan Yoder", "Marin Alvarez", "London Lindsey", "Beau Tristan Bentley", "Leo Gardner", "Hunter Uriah Mathew Clarke", "Mikayla Lopez", "Frankie Conner Ritter");
        List<String> expectedSortedNames = Arrays.asList("Marin Alvarez", "Adonis Julius Archer", "Beau Tristan Bentley", "Hunter Uriah Mathew Clarke", "Leo Gardner", "Vaugh Lewis", "London Lindsey", "Mikayla Lopez", "Janet Parsons", "Frankie Conner Ritter", "Shelby Nathan Yoder");

        // When
        SortNames sorter = new SortNames();
        sorter.sortNames(unsortedNames);

        // Then
        assertEquals(expectedSortedNames, unsortedNames);
    }
}
