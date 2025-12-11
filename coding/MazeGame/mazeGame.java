import java.util.Scanner;

public class mazeGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Maze grid
        String[][] maze = {
            {"O","X","_","X","X"},
            {"_","X","_","X","W"},
            {"_","_","_","X","_"},
            {"X","X","_","_","_"},
            {"_","_","_","X","X"}
        };

        // Player starting coordinates
        int x = 0;
        int y = 0;

        System.out.println("[Maze Game]");

        boolean inGame = true;

        while (inGame) {
            // Print current maze
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[i].length; j++) {
                    System.out.print(maze[i][j] + ".");
                }
                System.out.println();
            }

            // Ask for user input
            System.out.print("Which direction do you want to move? ");
            String move = scan.next();

            // Compute new coordinates
            int newX = x;
            int newY = y;

            switch (move.toLowerCase()) {
                case "up":    newX = x - 1; break;
                case "down":  newX = x + 1; break;
                case "left":  newY = y - 1; break;
                case "right": newY = y + 1; break;
                default:
                    System.out.println("That's not a valid direction!");
                    continue; // skip rest of loop
            }

            // Check bounds
            if (newX < 0 || newX >= maze.length || newY < 0 || newY >= maze[0].length) {
                System.out.println("You can't move there - it's out of bounds!");
                continue;
            }

            // Check target cell
            if (maze[newX][newY].equals("X")) {
                System.out.println("You hit a wall - Game Over!");
                break;
            } else if (maze[newX][newY].equals("W")) {
                maze[x][y] = "_";      // clear old position
                maze[newX][newY] = "O"; // move player
                for (int i = 0; i < maze.length; i++) {
                    for (int j = 0; j < maze[i].length; j++) {
                        System.out.print(maze[i][j] + ".");
                    }
                    System.out.println();
                }
                System.out.println("You win!");
                break;
            } else { // empty space
                maze[x][y] = "_";      // clear old position
                maze[newX][newY] = "O"; // move player
                x = newX;
                y = newY;
            }
        }

        scan.close();
    }
}
