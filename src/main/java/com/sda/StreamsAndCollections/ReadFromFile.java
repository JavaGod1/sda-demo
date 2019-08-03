package com.sda.StreamsAndCollections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {

    public List<String> readFromFile() throws IOException {

        Path absolutePath = Paths.get("C:\\Users\\Alexandrul46\\IdeaProjects\\AICI\\sda-course\\java-advanced-code\\src\\main\\resources\\Names");
        List<String> fileLines = Files.readAllLines(absolutePath);

        return fileLines;
    }
}


