package qa;

import java.util.Scanner;

public class MyFirstClass {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();

        System.out.println("Nice to meet you " + userName + "!");

        System.out.println("Your age:");

        int userAge = scanner.nextInt();

        if (userAge < 0) {

            System.out.println("Invalid data!");
            return;
        }

        if (userAge < 18){
            System.out.println(userName + " Ne moje da pie!");
        } else {
            System.out.println(userName + " Moje da pie!");








    }
}}
