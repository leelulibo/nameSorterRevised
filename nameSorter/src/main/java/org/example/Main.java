package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        runSortNames();
        runGivenNames();
    }

    private static void runSortNames() {
        String inputFileName = "unsorted-names-list.txt";
        String outputFileName = "sorted-names-list.txt";

        SortNames sorter = new SortNames();
        List<String> names = sorter.readNamesFromFile(inputFileName);
        if (names.isEmpty()) {
            System.err.println("Error: No names found in the input file.");
            return;
        }

        sorter.sortNames(names);
        sorter.writeNamesToFile(names, outputFileName);
    }

    private static void runGivenNames() {
        String fileName = "libs/unsorted-names-list.txt";

        GivenNames givenNames = new GivenNames();
        List<String> names =
                givenNames.readNamesFromFile(fileName);
        if (names.isEmpty()) {
            System.err.println("Error: No names found in the input file.");
            return;
        }

        givenNames.sortNames(names);

        givenNames.printSortedNames(names);
    }
}
