package com.sda.StreamsAndCollections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoStreamsAndCollections {
    public static void main(String[] args) throws IOException {

        List<String> names = new ArrayList<>();
        List<String> firstNames = new ArrayList<>();
        ReadFromFile reader = new ReadFromFile();
        names = reader.readFromFile();

        ManipulateList manipulator = new ManipulateList();
        firstNames = manipulator.getFirstName(names);

        Map<Integer, String> map = new HashMap<>();
        map = manipulator.mapNames(firstNames);

        WriteInFile writer = new WriteInFile();
        writer.writeInFile(firstNames);

    }
}
