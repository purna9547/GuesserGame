# GuesserGame
Guessing Game

A Java-based guessing game, which involves a Guesser, a Player, and an Umpire. The game consists of a Guesser, who generates a random number, a Player who attempts to guess this number, and an Umpire who decides who wins the game.


How to Run


Ensure you have Java installed.

Compile and run the code using the following commands in the terminal:


javac LaunchGame.java
java LaunchGame


Follow the instructions given by the program.


Code Description


LaunchGame is the main class which initiates the game by calling the login() method of the Login class.



Login is used to authenticate the user's login credentials by calling the checking() method from the FBCompany class.



FBCompany class handles the user authentication and calls the Umpire class for starting the guessing game.



Umpire class contains methods for retrieving guesses from the Guesser and Players, and deciding the winner of the game.



Guesser class is responsible for generating a random number that the player has to guess.



Player class contains a method for inputting a guess from a Player.



MyException1 class is a custom exception class to handle invalid login credentials from the user.



Facebook handles the input of login credentials from the user and throws the MyException1 if login credentials are invalid.

