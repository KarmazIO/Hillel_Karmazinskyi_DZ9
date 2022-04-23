package com.dz9;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class KarmazinskyiDZ9_1 {
    public static void main(String[] args) {
        int first[] = new int[7];
        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(first);


        System.out.println("Please enter 7 numbers from 0 to 9: ");
        Scanner sc1 = new Scanner(System.in);
        int second[] = new int[7];
        for (int i = 0; i < second.length; i++) {
            second[i] = getNumber(sc1);
        }
        Arrays.sort(second);


        int coincidence = 0;
        for (int j = 0; j < 7; j++) {
            if (first[j] == second[j]) coincidence++;
        }

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println("Number of coincidences: " + coincidence);
    }


    public static int getNumber(Scanner sc1) {
        do {
            if (sc1.hasNextInt()) {
                return sc1.nextInt();
            } else {
                System.out.println("Wrong input, try again");
                sc1.next();
            }
        } while (true);
    }

}


