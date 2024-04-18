package org.example;
import java.util.Arrays;


public class NameSorter implements SortAndSaveOperation {

    public String[] sortByLastName(String[] unsortedNames) {
        // Implement sorting by last name
        Arrays.sort(unsortedNames, (a, b) -> {
            String[] nameA = a.split(" ");
            String[] nameB = b.split(" ");
            return nameA[nameA.length - 1].compareTo(nameB[nameB.length - 1]);
        });
        return unsortedNames;
    }

    public String[] sortByGivenNames(String[] unsortedNames) {
        // Implement sorting by given names
        Arrays.sort(unsortedNames);
        return unsortedNames;
    }

    public String[] sortByMultipleGivenNames(String[] unsortedNames) {
        // Implement sorting by multiple given names
        Arrays.sort(unsortedNames);
        return unsortedNames;
    }

    @Override
    public void sortAndSaveToFile(String inputFile) {
        // Implement sorting and saving to file
        String[] sortedNames = sortFromFile(inputFile);
        // Write sortedNames to file
    }

    public String[] sortFromFile(String inputFile) {
        // Implement reading names from file and sorting
        // Return sorted names
        return new String[0];
    }



}
