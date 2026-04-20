package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which story would you like to read?(1-3): ");
        int storyNumber = scanner.nextInt();

        try {
            FileReader fileReader1 = new FileReader("goldilocks.txt");
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
            String line;

            FileReader fileReader2 = new FileReader("handsel_and_gretel.txt");
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

            FileReader fileReader3 = new FileReader("mary_had_a_little_lamb.txt");
            BufferedReader bufferedReader3 = new BufferedReader(fileReader3);



            String[] stories = new String[3];
            stories[0] = bufferedReader1.readLine();
            stories[1] = bufferedReader2.readLine();
            stories[2] = bufferedReader3.readLine();




            while ((line = stories[storyNumber - 1]) != null) {
                System.out.println(line);
            }


        } catch (Exception e) {
            System.out.println("Something went wrong please try again!");

        }

    }
}
