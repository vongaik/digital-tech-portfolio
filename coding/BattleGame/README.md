# Battle Game (Java)

A simple turn-based fighter game I created demonstrating OOP fundamentals: classes, constructors, encapsulation, and multi-file interaction. `battleGame.java` runs the game loop; `NPC.java` defines character stats and combat logic.

## Overview
Two characters are created with stats determined by a numeric **classID**. Each round the player and CPU choose to **attack** or **defend**; HP updates until one side reaches 0.

## Key features
- `NPC` class with private attributes: HP, attack, defense, classID, name.  
- Constructor maps `classID` → stats (Sword Fighter, Unicorn Sorcerer, Dance Battler).  
- Encapsulated methods: `calculateAttack`, `takeDamage`, `isStillAlive`.  
- Clean separation: `battleGame.java` handles I/O & rounds, `NPC.java` handles character logic.

## How points / damage are calculated
- **Attack value:**  
  ```
  finalAttack = baseAttack * (1 - opponentDefense)
  ```
- **Damage taken when defending:**  
  ```
  damageTaken = incomingAttack * (1 - selfDefense) - 6
  ```
- Damage is clamped to a minimum of `0`. HP never goes below `0`.

## Tech stack
- **Language:** Java (Java 11+ / 17 recommended)  
- **Editor:** VS Code, IntelliJ, or any Java IDE  
- **Concepts shown:** OOP, method design, basic game loop, input handling

## Run locally
Put both files in the same folder and run from a terminal:

```bash
javac battleGame.java NPC.java
java battleGame
```
