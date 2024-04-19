package AcceptanceTests;

import org.example.GivenNames;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GivenMultipleNames {

    //Story: As a user, I want the name sorter to handle names with up to three given names.
    //Scenario 1: Sorting names with up to three given names.
    //Given a list of unsorted names with some having up to three given names
    //When the name sorter program is executed with the input file
    //Then the names should be sorted correctly considering all given names
    //And the sorted names should be displayed on the screen
    //And the sorted names should be saved in a file in the working directory

    @Test
    public void testHandlingMultipleGivenNames() {
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
