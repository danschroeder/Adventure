/*
 * Name: Daniel Schroeder
 * Class: CS3060
 * Section: 601
 * Project 3

* I declare that the following source code is my work.
* I understand and can explain everything I have written, if asked.
* I understand that copying any source code, in whole or in part,
* that is not in my textbook nor provided or expressly permitted by the instructor, 
* constitutes cheating. I will receive a zero on this project for 
* poor academic performance if I am found in violation of this policy.
*/
//package adventure;
import java.util.*;
import java.io.*;
public class Adventure {

    static int MAP_SIZE = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int currentRow = 0, currentColumn = 0;
        String[] inventory = new String[]{"brass lantern", "rope", "rations", "staff"};
        String[] command;
        Character commandChar = ' ';
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Dan's Adventure game!!!\nPlease type a command to begin your adventure:");

        while (!commandChar.equals('q'))//main program
        {
            System.out.print(">");
            command = input.nextLine().toLowerCase().split(" +");
            commandChar = command[0].charAt(0);
            switch (commandChar) {
                case 'g':
                    //System.out.println("case was g");
                    switch (command[1].charAt(0)) {
                        case 'n':
                            if (currentRow - 1 > 0) {
                                currentRow--;
                                System.out.println("Moving north...\nYou are at location " + currentRow + ", " + currentColumn);
                            } else {
                                System.out.println("You cant go that far north.\nYou are at location " + currentRow + ", " + currentColumn);
                            }
                            break;
                        case 'e':
                            if (currentColumn + 1 < MAP_SIZE) {
                                currentColumn++;
                                System.out.println("Moving east...\nYou are at location " + currentRow + ", " + currentColumn);
                            } else {
                                System.out.println("You cant go that far east.\nYou are at location " + currentRow + ", " + currentColumn);
                            }
                            break;
                        case 's':
                            if (currentRow + 1 < MAP_SIZE) {
                                currentRow++;
                                System.out.println("Moving south...\nYou are at location " + currentRow + ", " + currentColumn);
                            } else {
                                System.out.println("You cant go that far south.\nYou are at location " + currentRow + ", " + currentColumn);
                            }
                            break;
                        case 'w':
                            if (currentColumn - 1 > 0) {
                                currentColumn--;
                                System.out.println("Moving west...\nYou are at location " + currentRow + ", " + currentColumn);
                            } else {
                                System.out.println("You cant go that far west.\nYou are at location " + currentRow + ", " + currentColumn);
                            }
                            break;
                        default:
                            System.out.println("You can't go that way.\nYou are at location " + currentRow + ", " + currentColumn);
                            break;
                    }
                    break;

                case 'i':
                    System.out.println("You are carrying:");
                    for(int i=0; i<inventory.length;i++)
                    {
                        System.out.println(inventory[i]);
                    }
                    System.out.println("You are at location " + currentRow + ", " + currentColumn);
                    break;
                case 'q':
                    System.out.println("Farewell\nYou are at location " + currentRow + ", " + currentColumn);
                    break;
                default:
                    System.out.println("Invalid command: " + command[0] +"\nYou are at location " + currentRow + ", " + currentColumn);
                    break;
            }
        }

    }
}
