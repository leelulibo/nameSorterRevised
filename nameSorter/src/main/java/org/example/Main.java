package org.example;
Ok
import java.util.List;
T

public class Main {

    public static void main(String[] args) {
        runSortNames();
        runGivenNames();
    }Okay

    private static void runSortNames() {
        String inputFileName = "libs/unsorted-names-list.txt";
        String outputFileName = "libs/sorted-names-list.txt";

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
