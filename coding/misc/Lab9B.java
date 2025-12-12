/*
Class: CSE 1321L
Section: WJ1
Term: Summer 2022
Instructor: Prof. Maneesha Penmetsa
Name: Vongai Kwenda
Lab#: 9
*/
import java.util.Scanner;
public class Lab9B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] myArray = new int[11];

        System.out.println("Please enter 11 numbers:");

        for (int i=0; i < myArray.length; i++)
        {
            System.out.print("Integer "+(i+1)+": ");
            myArray[i] = scan.nextInt();

        }
        //BubbleSort
        for (int i=0; i < myArray.length -1; i++)
        {
            for (int j=0; j < myArray.length - 1 - i; j++)
            {
                if (myArray[j] > myArray[j+1])
                {
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }

            }
        }


        System.out.print("What is the target number: ");
        int target = scan.nextInt();

        //print with foreach
        System.out.print("The sorted set is: ");

        for(int x : myArray) {
            System.out.print(x +" ");
        }

        //find target using binary search
        int low = 0, mid = 0, high = myArray.length-1;
        boolean found = false;

        while (high >= low)
        {
            mid = (low+high) / 2;
            System.out.print("\nLow is "+low+"\nHigh is "+high+"\nMid is "+mid+"\nSearching");
            if (target < myArray[mid])
            {
                high = mid-1;
            }
            else if (target == myArray[mid])
            {
                found = true;
                System.out.print("\nThe target is in the set.");
                break;
            }
            else
            {
                low = mid +1;
            }

        }

        if (found == false)
        {
            System.out.println("\nThe target is not in the set.");
        }



    }
}
