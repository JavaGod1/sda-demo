package com.sda.StreamsAndCollections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteInFile {

    public void writeInFile(List<String> list) throws IOException {
        Path path = Paths.get("C:\\Users\\Alexandrul46\\IdeaProjects\\SDA2\\sda-demo\\src\\main\\resources\\firstNamesFile");
        Files.write(path, list);
    }

}
