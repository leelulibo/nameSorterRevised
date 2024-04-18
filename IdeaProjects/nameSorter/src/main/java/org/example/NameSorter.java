package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSorter implements SortAndSaveOperation {

    public String[] sortByLastName(String[] unsortedLastNames) {
        // Implement sorting by last name
        Arrays.sort(unsortedLastNames, Comparator.comparing((String name) -> {
            String[] parts = name.split(" ");
            return parts[parts.length - 1];
        }));
        return unsortedLastNames;
    }

    public String[] sortByGivenNames(String[] unsortedGivenNames) {
        // Implement sorting by given names
        Arrays.sort(unsortedGivenNames);
        return unsortedGivenNames;
    }

    public String[] sortByMultipleGivenNames(String[] unsortedMultipleNames) {
        // Implement sorting by multiple given names
        Arrays.sort(unsortedMultipleNames);
        return unsortedMultipleNames;
    }

    @Override
    public void sortAndSaveToFile(String inputFile) {


        // Read unsorted names from the input file
        List<String> unsortedNames = readNamesFromFile(inputFile);

        // Sort the names
        String[] sortedNames = sortByLastName(unsortedNames.toArray(new String[0]));
        String[] sortedGivenNames = sortByGivenNames(unsortedNames.toArray(new String[0]));
        String[] sortedMultipleNames = sortByMultipleGivenNames(unsortedNames.toArray(new String[0]));
        // Write sorted names to a new file
        String outputFile = "sorted-names-list.txt";
        writeNamesToFile(outputFile, sortedNames,sortedGivenNames,sortedMultipleNames);
    }

    private List<String> readNamesFromFile(String inputFile) {
        List<String> names = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    private void writeNamesToFile(String outputFile, String[] lastNames, String[] givenNames, String[] multipleNames) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            int maxLength = Math.max(lastNames.length, Math.max(givenNames.length, multipleNames.length));

            for (int i = 0; i < maxLength; i++) {
                if (i < lastNames.length) {
                    writer.write(lastNames[i]);
                    writer.newLine();
                }
                if (i < givenNames.length) {
                    writer.write(givenNames[i]);
                    writer.newLine();
                }
                if (i < multipleNames.length) {
                    writer.write(multipleNames[i]);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
