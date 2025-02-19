package org.thakur.lecture5.file.handling;

import java.io.*;
import java.util.*;

public class FileHandlingTask {
    public static void main(String[] args) {
        final FileHandlingTask fileHandlingTask = new FileHandlingTask();

        try {
            System.out.println("Task - 1: ");

            final List<String> lines = fileHandlingTask.readContents();
            final List<Integer> results = new ArrayList<>();
            final int count = Integer.parseInt(lines.getFirst());

            for (int i = 0; i < count; i++) {
                final List<Integer> testCase = Arrays.stream(lines.get(i + 1).split(" "))
                        .map(Integer::parseInt)
                        .toList();

                results.add(testCase.get(0) + testCase.get(1));
            }

            fileHandlingTask.writeOutput(results);

            System.out.println("Done check output!");

            System.out.println("-----");

            System.out.println("Task - 2: ");
            fileHandlingTask.findWords();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private List<String> readContents() throws IOException {
        final FileReader fileReader = new FileReader("./src/main/resources/test_cases.txt");
        final BufferedReader bufferedReader = new BufferedReader(fileReader);

        final List<String> contents = bufferedReader.lines().toList();

        bufferedReader.close();
        fileReader.close();

        return contents;
    }

    private void writeOutput(final List<Integer> results) throws IOException {
        final FileWriter fileWriter = new FileWriter("./src/main/resources/output.txt");
        final BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Integer result : results) {
            bufferedWriter.write(result.toString());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        fileWriter.close();
    }

    private void findWords() throws IOException {
        final FileReader fileReader = new FileReader("./src/main/resources/words.txt");
        final BufferedReader bufferedReader = new BufferedReader(fileReader);

        final List<String> contents = bufferedReader.lines().toList();

        System.out.println("Line count: " + contents.size());

        final Integer wordCount = contents.stream().map(FileHandlingTask::getWordLength).reduce(0, Integer::sum);

        System.out.println("Word count: " + wordCount);

        bufferedReader.close();
        fileReader.close();
    }

    private static int getWordLength(String line) {
        if (line == null)
            return 0;
        return line.split(" ").length;
    }
}
