package com.sda.randomizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class txtFileReader {
    public List<String> txtFileReader(String path) {
        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            list = stream
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
