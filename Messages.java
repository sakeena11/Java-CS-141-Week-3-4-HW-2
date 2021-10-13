import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        //get the user's name
        System.out.println("What is your name?");
        Scanner scnr = new Scanner(System.in);
        String name = scnr.nextLine();

        //call the methods below to print a welcome message and a goodbye message
        welcome(name);
        goodbye(name);
    } //end main

    /*
     * complete the method below to print a welcome message:
     * "Welcome to the program, <name>!"
     * where <name> is replaced with the String parameter containing the user's name
     */

    public static void welcome(String name) {
        //TODO: complete the body code of the method welcome()
        System.out.println("Welcome to the program, " + name  + "!");

    } //end welcome

    /*
     * complete the method below to print a goodbye message:
     * "Goodbye, <name>."
     * where <name> is replaced with the String parameter containing the user's name
     */

    //TODO: create and complete the method goodbye()
    public static void goodbye(String name) {
        System.out.println("Goodbye, " + name + ".");
    }



} //end Messages

