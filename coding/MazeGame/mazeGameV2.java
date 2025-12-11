import java.util.Scanner;

public class mazeGameV2 {

    // Check if new position is inside bounds of the maze
    public static boolean checkValidPosition(char[][] maze, int newRow, int newCol) {
        return newRow >= 0 && newRow < maze.length && newCol >= 0 && newCol < maze[0].length;
    }

    // Check if player has hit wall, reached goal, or still playing
    // Returns: 0 = lost, 1 = still playing, 2 = won
    public static int checkGameStatus(char[][] maze, int row, int col) {
        if (maze[row][col] == 'X') return 0; // hit wall
        else if (maze[row][col] == 'W') return 2; // won
        else return 1; // still playing
    }

    // Print the maze to console
    public static void printMaze(char[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + ".");
            }
            System.out.println();
        }
    }

    // Move player from old to new position
    public static void makeMove(char[][] maze, int currRow, int currCol, int newRow, int newCol) {
        maze[currRow][currCol] = '_';   // clear old position
        maze[newRow][newCol] = 'O';     // set new position
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] maze = {
                {'O', 'X', '_', 'X', 'X'},
                {'_', 'X', '_', 'X', 'W'},
                {'_', '_', '_', 'X', '_'},
                {'X', 'X', '_', '_', '_'},
                {'_', '_', '_', 'X', 'X'}
        };

        int currRow = 0;
        int currCol = 0;

        System.out.println("[Maze Game]");
        printMaze(maze);

        while (true) {
            System.out.print("Which direction do you want to move? ");
            String input = sc.nextLine();

            int newRow = currRow;
            int newCol = currCol;

            switch (input.toLowerCase()) {
                case "up":    newRow = currRow - 1; break;
                case "down":  newRow = currRow + 1; break;
                case "left":  newCol = currCol - 1; break;
                case "right": newCol = currCol + 1; break;
                default:
                    System.out.println("That's not a valid direction!");
                    continue; // ask again
            }

            if (!checkValidPosition(maze, newRow, newCol)) {
                System.out.println("You can't move there - it's out of bounds!");
                continue;
            }

            int status = checkGameStatus(maze, newRow, newCol);

            if (status == 0) {
                System.out.println("You hit a wall - Game Over!");
                break;
            } else if (status == 2) {
                makeMove(maze, currRow, currCol, newRow, newCol);
                printMaze(maze);
                System.out.println("You win!");
                break;
            } else { // still playing
                makeMove(maze, currRow, currCol, newRow, newCol);
                currRow = newRow;
                currCol = newCol;
            }

            System.out.println();
            printMaze(maze);
        }

        sc.close();
    }
}
