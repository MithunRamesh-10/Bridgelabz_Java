package javaComplexities;

import java.io.*;

/**
 * Problem 4 (Runtime Analysis - File Reading)
 * Compare FileReader and InputStreamReader
 * using buffered reading.
 *
 * Author : Mithun
 * Date : 12-10-2026
 */

public class FileReadingComparison {

    private static final String FILE_PATH =
            "Bridgelabz_Java/src/main/java/runtime_test_data.txt";

    // Create the sample file automatically
    public static void createSampleFile(String fileName)
            throws IOException {

        File file = new File(fileName);

        // Create the parent directory if it does not exist
        File parent = file.getParentFile();

        if (parent != null) {
            parent.mkdirs();
        }

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(file))) {

            for (int i = 0; i < 10000; i++) {
                writer.write("Runtime analysis file reading test.\n");
            }
        }
    }

    // Read characters using FileReader
    // Time Complexity: O(N)
    public static long readUsingFileReader(String fileName)
            throws IOException {

        long characters = 0;

        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {

            char[] buffer = new char[4096];
            int count;

            while ((count = reader.read(buffer)) != -1) {
                characters += count;
            }
        }

        return characters;
    }

    // Read characters using InputStreamReader
    // Time Complexity: O(N)
    public static long readUsingInputStreamReader(String fileName)
            throws IOException {

        long characters = 0;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName)))) {

            char[] buffer = new char[4096];
            int count;

            while ((count = reader.read(buffer)) != -1) {
                characters += count;
            }
        }

        return characters;
    }

    public static void main(String[] args) throws IOException {

        // Create the file before attempting to read it
        createSampleFile(FILE_PATH);

        File file = new File(FILE_PATH);

        System.out.println("File Reading Runtime Comparison");
        System.out.println("File Location: "
                + file.getAbsolutePath());
        System.out.println("File Size: "
                + file.length() + " bytes");

        // Measure FileReader execution time
        long start = System.nanoTime();
        long fileReaderCount = readUsingFileReader(FILE_PATH);
        long fileReaderTime = System.nanoTime() - start;

        // Measure InputStreamReader execution time
        start = System.nanoTime();
        long inputStreamCount =
                readUsingInputStreamReader(FILE_PATH);
        long inputStreamTime = System.nanoTime() - start;

        System.out.println("FileReader Characters: "
                + fileReaderCount);
        System.out.println("FileReader Time: "
                + fileReaderTime + " ns");

        System.out.println("InputStreamReader Characters: "
                + inputStreamCount);
        System.out.println("InputStreamReader Time: "
                + inputStreamTime + " ns");

        System.out.println("Same Character Count: "
                + (fileReaderCount == inputStreamCount));
    }
}