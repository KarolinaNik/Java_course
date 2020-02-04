package chapter4;

/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

Roll the die for the user (generate a Random number between 1 – 6)
and advance the user that number of spaces on the game board. Here’s the code to do this
((import is java.util.Random):

Random random = new Random();
int die = random.nextInt(6) + 1;

After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
Repeat this 4 additional times, for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
If they are greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.

Output:
Roll #1: You've rolled a 3. You are now on space 3 and have 17 more to go.
Roll #2: You've rolled a 3. You are now on space 6 and have 14 more to go.
Roll #3: You've rolled a 3. You are now on space 9 and have 11 more to go.
Roll #4: You've rolled a 5. You are now on space 14 and have 6 more to go.
Roll #5: You've rolled a 6. You're on space 20. Congrats, you win!
*/

public class RollDieGame {
}
