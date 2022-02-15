package com.daryl;

import java.util.Scanner;

public class Lab1Q3 {
    public static void main(String[] args) {
        System.out.println("Enter Module Code:");
        Scanner scanf = new Scanner(System.in);
        String module=scanf.nextLine();
        switch (module) {
            case "1006" -> System.out.println("Mathematics 2");
            case "1007" -> System.out.println("Operating Systems");
            case "1008" -> System.out.println("Data Structures and Algorithms");
            case "1009" -> System.out.println("Object Oriented Programming");
            default -> System.out.println("Computer Networks");
        }

    }
}
