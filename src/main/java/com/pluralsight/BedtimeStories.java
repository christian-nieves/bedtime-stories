package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the story file: ");
        String storyName = scanner.nextLine();


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(storyName));

            String line;
            int lineNumber = 1;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.printf("%d. %s%n", lineNumber, line);
                lineNumber++;
            }
            scanner.close();
            bufferedReader.close();


        } catch (Exception e) {
            System.out.println("Something went wrong please try again!");

        }

    }
}
