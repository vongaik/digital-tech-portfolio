import java.util.*;

public class Assignment7A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("[Rate Audio CD Collection]");
        System.out.print("How many CDs do you have lying around your car? ");
        int numCDs = scan.nextInt();
        scan.nextLine(); // consume newline

        AudioCD[] audioCDObjects = new AudioCD[numCDs];

        // Input loop for all CDs
        for (int i = 0; i < numCDs; i++) {
            System.out.println("CD #" + (i + 1) + ":");

            System.out.print("*Enter Title: ");
            String cdTitle = scan.nextLine();

            String[] artists = new String[4];
            System.out.println("*Enter Artists (type -1 to stop):");
            for (int j = 0; j < 4; j++) {
                System.out.print("Artist #" + (j + 1) + ": ");
                String artistName = scan.nextLine();
                if (artistName.equals("-1")) break;
                artists[j] = artistName;
            }

            System.out.print("*Enter Release Year: ");
            int releaseYear = scan.nextInt();
            scan.nextLine(); // consume newline

            System.out.print("*Enter Genre: ");
            String genre = scan.nextLine();

            System.out.print("*Enter Condition: ");
            float condition = scan.nextFloat();
            scan.nextLine(); // consume newline

            audioCDObjects[i] = new AudioCD(cdTitle, artists, releaseYear, genre, condition);
            System.out.println();
        }

        // Main menu
        int choice;
        do {
            System.out.println("[Main Menu]");
            System.out.println("1) Album Info");
            System.out.println("2) Find a CD");
            System.out.println("3) Find an artist");
            System.out.println("4) Log off");
            System.out.print("Choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // consume newline

            switch (choice) {
                case 1: // Print CD info
                    System.out.print("Which CD do you want? ");
                    int cdIndex = scan.nextInt() - 1;
                    scan.nextLine();
                    if (cdIndex < 0 || cdIndex >= numCDs) {
                        System.out.println("Sorry, there's no CD that matches the criteria.");
                    } else {
                        audioCDObjects[cdIndex].display();
                    }
                    break;

                case 2: // Find CD by title
                    System.out.print("What is the CD's name? ");
                    String searchTitle = scan.nextLine();
                    boolean foundCD = false;
                    for (AudioCD cd : audioCDObjects) {
                        if (cd.getCdTitle().equalsIgnoreCase(searchTitle)) {
                            System.out.println("There is a match!");
                            cd.display();
                            foundCD = true;
                        }
                    }
                    if (!foundCD) System.out.println("Sorry, there's no CD that matches the criteria.");
                    break;

                case 3: // Find CDs by artist
                    System.out.print("What artist are you looking for? ");
                    String searchArtist = scan.nextLine();
                    int count = 0;
                    for (AudioCD cd : audioCDObjects) {
                        for (String artist : cd.getArtists()) {
                            if (artist.equalsIgnoreCase(searchArtist)) {
                                if (count == 0) System.out.println(count + " CD(s) found!");
                                System.out.println("CD: " + cd.getCdTitle());
                                count++;
                                break;
                            }
                        }
                    }
                    if (count == 0) System.out.println("Sorry, no artist found.");
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println();

        } while (choice != 4);

        scan.close();
    }
}
