package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GivenNames implements NameSorting {

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

    static void printSortedNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Override
    public void sortNames(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                String[] parts1 = name1.split(" ");
                String[] parts2 = name2.split(" ");
                String lastName1 = parts1[parts1.length - 1];
                String lastName2 = parts2[parts2.length - 1];
                int lastNameComparison = lastName1.compareTo(lastName2);
                if (lastNameComparison == 0) {
                    return name1.compareTo(name2);
                }
                return lastNameComparison;
            }
        });
    }
}
