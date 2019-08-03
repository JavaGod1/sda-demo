package com.sda.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsConvertStringToInt {
    public static void main(String[] args) {
        List<String> carBrands = new ArrayList<>();
        carBrands.add("Lamborghini");
        carBrands.add("Mercedes");
        carBrands.add("BMW");
        carBrands.add("Renault");
        carBrands.add("Dacia");
        carBrands.add("Bentley");

        System.out.println("List of Strings: " + carBrands);

        List<Integer> listOfInts = carBrands.stream()
                .map(carBrandString -> carBrandString.length())
                .collect(Collectors.toList());

        System.out.println("List of Ints: " + listOfInts);

        long count = listOfInts.stream()
                .collect(Collectors.counting());
        System.out.println("Total number of characters: " + count);
        listOfInts.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
        int result = listOfInts.stream()
                .reduce(0, (firstElement, secondElement) -> firstElement + secondElement);
        System.out.println("Printing result: " + result);


    }


}
