package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNames implements NameSorting {
    public static void main(String[] args) {
        String inputFileName = "libs/unsorted-names-list.txt";
        String outputFileName = "libs/sorted-names-list.txt";

        // Validate input file existence and readability
        if (!isReadable(inputFileName)) {
            System.err.println("Error: Input file is not readable or does not exist.");
            return;
        }

        List<String> names = readNamesFromFile(inputFileName);
        if (names.isEmpty()) {
            System.err.println("Error: No names found in the input file.");
            return;
        }

        SortNames sorter = new SortNames();
        sorter.sortNames(names);

        writeNamesToFile(names, outputFileName);
    }

    private static boolean isReadable(String fileName) {
        return Files.isReadable(Paths.get(fileName));
    }

    private static List<String> readNamesFromFile(String fileName) {
        List<String> names = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    private static String extractLastName(String fullName) {
        String[] parts = fullName.split(" ");
        return parts[parts.length - 1];
    }

    private static void writeNamesToFile(List<String> names, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Sorted names have been written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sortNames(List<String> names) {
        Collections.sort(names, Comparator.comparing(SortNames::extractLastName));
    }
}
