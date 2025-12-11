# Maze Game (Java)

A short Java program I created showcasing fundamental programming concepts through a simple 5x5 grid-based maze game. This project highlights core skills such as 2D array manipulation, input handling, control flow, and state management—key topics.

## Overview
The program represents a maze using a 2D array and updates the player's position based on text-based directional input. Each turn re-renders the grid, validates movement, and enforces boundaries and obstacles.

## Key Concepts Demonstrated
- **2D Arrays:** Maze represented as a grid of symbols.
- **State Management:** Tracking player coordinates and updating the maze in real time.
- **Control Flow & Logic:** Movement handling, bounds checking, win/lose conditions.
- **User Input Processing:** Reading and interpreting commands using `Scanner`.
- **Clean Console Output:** Redrawing and formatting the maze each step.
- **Basic Game Loop Structure:** Continuous loop until termination conditions are met.

## How It Works
- The maze is a 5×5 grid stored in a 2D array.
- `O` marks the player's position.
- `X` are walls (game over if you walk into one).
- `W` is the goal.
- `_` represents empty paths.
- User enters a direction each turn, and the game updates the grid in real time.

## How to Run
Make sure you have a JDK installed, then compile and run in terminal. Use words "up", "down", "left", "right" to move:

```bash
javac mazeGame.java
java mazeGame
```

## Maze Grid
<img width="347" height="157" alt="Maze Grid" src="https://github.com/user-attachments/assets/2b56f87d-26e6-4431-af67-277b5ce66372" />

