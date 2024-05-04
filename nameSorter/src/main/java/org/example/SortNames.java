package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNames implements NameSorting {

    public boolean isReadable(String fileName) {
        return Files.isReadable(Paths.get(fileName));
    }

    static List<String> readNamesFromFile(String fileName) {
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

    static void writeNamesToFile(List<String> names, String fileName) {
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
