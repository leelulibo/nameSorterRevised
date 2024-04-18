package org.example;

import java.io.IOException;

public interface SortAndSaveOperation {
    String inputFile = "unsorted-names-lists.txt";

    void sortAndSaveToFile(String inputFilePath) throws IOException;

    default String parseInputFile() {
        // Parsing logic using inputFile
        return "Parsed result";
    }
}
