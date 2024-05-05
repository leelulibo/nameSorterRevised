package org.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        runSortNames();
        runGivenNames();
    }

    private static void runSortNames() {
        String inputFileName = "src\\main\\java\\org\\example\\unsorted-names-list.txt";
        String outputFileName = "src\\main\\java\\org\\example\\sorted-names-list.txt";

        SortNames sorter = new SortNames();
        List<String> names = SortNames.readNamesFromFile(inputFileName);

        if (names.isEmpty()) {
            System.err.println("Error: No names found in the input file.");
            return;
        }

        sorter.sortNames(names);
        SortNames.writeNamesToFile(names, outputFileName);

    }

    private static void runGivenNames() {
        String fileName = "src\\main\\java\\org\\example\\unsorted-names-list.txt";

        GivenNames givenNames = new GivenNames(); // Instantiate the GivenNames class
        List<String> names = SortNames.readNamesFromFile(fileName);

        if (names.isEmpty()) {
            System.err.println("Error: No names found in the input file.");
            return;
        }

        givenNames.sortNames(names);
        GivenNames.printSortedNames(names);

    }
}
