/*
Class: CSE 1321L
Section: WJ1
Term: Summer 2022
Instructor: Prof. Maneesha Penmetsa
Name: Vongai Kwenda
Lab#: 6
*/
import java.util.Scanner;

public class basicBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 1000;
        char userInput = ' ';

        System.out.println("Welcome!\nYou have $1000 in your account.");
        do {
            System.out.print("Menu\n0 - Make a deposit\n1 - Make a withdrawal\n2 - Display account value\n\nPlease make a selection: ");
            int select = scan.nextInt();
            if (select == 0) //deposit
            {
                System.out.print("How much would you like to deposit? : ");
                int userMoney = scan.nextInt();
                balance = balance + userMoney;
                System.out.println("Your current balance is $" + balance);
            } else if (select == 1) //withdraw
            {
                System.out.print("How much money would you like to withdraw? : ");
                int userMoney = scan.nextInt();
                balance = balance - userMoney;
                System.out.println("Your current balance is $" + balance);
            } else if (select == 2) //display balance
            {
                System.out.println("Your current balance is $" + balance);
            } else {
                System.out.println("Invalid entry, please try again.");
            }

            System.out.print("Would you like to return to the main menu (Y/N)? : ");
            userInput = scan.next().charAt(0);
        } while (userInput == 'y' || userInput == 'Y');



        //-------------------------
        System.out.println("Thank you for banking with us!"); //when userInput is no
        scan.close();
    }
}
