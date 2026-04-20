package com.pluralsight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileReader fileReader1 = new FileReader("goldilocks.txt");
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

            FileReader fileReader2 = new FileReader("handsel_and_gretel.txt");
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

            FileReader fileReader3 = new FileReader("mary_had_a_little_lamb.txt");
            BufferedReader bufferedReader3 = new BufferedReader(fileReader3);

            String line;

            System.out.println("Which story would you like to read?(1-3): ");
            int storyNumber = scanner.nextInt();




        } catch (FileNotFoundException e) {

        }

    }
}
