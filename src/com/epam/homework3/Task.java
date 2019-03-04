package com.epam.homework3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        System.out.print("Enter number of task: ");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        if (menu == 1)
        {
            System.out.println("First");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if(menu == 2)
        {
            System.out.println("Second");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (j < i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }
        }
        else if (menu == 3)
        {
            System.out.println("Third");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (j < 4 - i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.print("\n");
            }
        }
        else if (menu == 4)
        {
            System.out.println("Fourth");
            for (int i = 0; i < 4; ++i) {
                for (int j = 4; j > i; --j) {
                    System.out.print(" ");
                }
                for (int j = 0; i > j; ++j) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i < 4; ++i) {
                for (int j = 0; i > j; ++j) {
                    System.out.print(" ");
                }
                for (int j = 4; j > i; --j) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if( menu == 5 )
        {
            System.out.println("Fifth");
            for (int i = 0; i < 4; i++) {
                for (int j = i; j < 4; j++)
                    System.out.print(" ");
                for (int k = 4; k >= 4 - (2 * i); k--)
                    System.out.print("*");
                System.out.print("\n");
            }
            for (int i = 0; i < 4; i++) {
                for (int j = i; j < 4; j++)
                    System.out.print(" ");
                for (int k = 4; k >= 4 - (2 * i); k--)
                    System.out.print("*");
                System.out.print("\n");
            }
        }
    }
}
