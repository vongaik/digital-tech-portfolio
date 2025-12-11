//overloaded sorting
import java.util.*;
public class Assignment6C {

    //a2 = arr2,arr1,arr3
    public static int[] sortArray(int[] a2)
    {
        //sort with arrays class
        Arrays.sort(a2);
        System.out.println("The sorted values are: ");

        return a2;
    }

    public static char[] sortArray(char[] a2) {
        //sort values
        Arrays.sort(a2);
        System.out.println("The sorted values are: ");

        return a2;
    }

    public static float[] sortArray(float[] a2) {
        //sort values
        Arrays.sort(a2);
        System.out.println("The sorted values are: ");

        return a2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] arr1 = new float[8];
        int arr2[] = new int[8];
        char[] arr3 = new char[8];

        System.out.println("[Overloaded Sort]");
        System.out.print("What data type do you want to enter? ");
        String dataType = scan.next();

        if (dataType.equals("float"))
        {
            for (int i=0; i < arr1.length; i++)
            {
                System.out.print("Value "+(i+1)+": ");
                float value = scan.nextFloat();
                arr1[i] = value;

            }
            System.out.println("Calling sortArray()...");
            arr1 = sortArray(arr1);
            //print 1d array
            for (int i=0; i < arr1.length; i++)
            {
                System.out.print(arr1[i]+", ");
            }
        }

        if (dataType.equals("char"))
        {
            for (int i=0; i < arr3.length; i++)
            {
                System.out.print("Value "+(i+1)+": ");
                char value = scan.next().charAt(0);
                arr3[i] = value;
            }
            System.out.println("Calling sortArray()...");
            arr3 = sortArray(arr3);
            //print 1d array
            for (int i=0; i < arr3.length; i++)
            {
                System.out.print(arr3[i]+", ");
            }

        }

        if (dataType.equals("int"))
        {
            for (int i=0; i < arr2.length; i++)
            {
                System.out.print("Value "+(i+1)+": ");
                int value = scan.nextInt();
                arr2[i] = value;

            }

           System.out.println("Calling sortArray()...");
            arr2 = sortArray(arr2);
            //print 1d array
            for (int i=0; i < arr2.length; i++)
            {
                System.out.print(arr2[i]+", ");
            }

        }



    }
}
