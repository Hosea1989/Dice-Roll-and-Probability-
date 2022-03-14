import java.util.Scanner;
/*
 * Assignment:Project 3
 * Description: This program takes a number from the user and then rolls a random dice.
 *              It then counts how many time each face shows up. The probability is then shown in the end.
 * Name: Damien Hosea
 * ID: 921395901
 * Class: CSC 210 - 07
 * Semester: Fall 2020
 */

public class DiceRoll {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        //This is a quick introduction
        System.out.println(" Let's roll the dice!");

        //These are the variables can be seen as counters for each dice face.
        int counter = 0;
        int diceOnes = 0;
        int diceTwos = 0;
        int diceThrees = 0;
        int diceFours = 0;
        int diceFives = 0;
        int diceSixes = 0;

        //This is a constant that will determine the number of times the dice will roll.
       // final int NUMBER_OF_ROLLS = 10000;

        System.out.println(" How many times should I roll the dice? ");

        //Passing the int that the user entered to the NUMBER_OF_ROLLS variable
        int NUMBER_OF_ROLLS = input.nextInt();

        //This is a while loop that loops for as long as counter is lower than the number entered by the user.
        while (counter < NUMBER_OF_ROLLS) {

            //This diceRoll variable holds a random number between 1-6
            int diceRoll = (int) (Math.random()* 6 + 1);

            //This if statement increments the respective dice face depending on how many times that face is rolled.
            if (diceRoll == 1)
                diceOnes ++;
            else if ( diceRoll == 2)
                diceTwos ++;
            else if (diceRoll == 3)
                diceThrees ++;
            else if (diceRoll == 4)
                diceFours ++;
            else if (diceRoll == 5)
                diceFives ++;
            else if (diceRoll == 6)
                diceSixes ++;

            //Increment the counter so that the while loop ends at some point.
            counter++;
        }

        System.out.println("Occurrence of each face: ");
        System.out.print (diceOnes + " , " + diceTwos + " , " + diceThrees + " , " + diceFours +
                " , " + diceFives + " , " + diceSixes + " :");

        //In order to prove that the random numbers add up to the number entered by the user, all the counters need
        //to be added up and placed in a double diceSum variable
        double diceSum = ( diceOnes + diceTwos + diceThrees + diceFours + diceFives + diceSixes);
        System.out.println(diceSum);

        System.out.println("Therefore the Probability is: ");
        System.out.println(diceOnes/diceSum + " , " + diceTwos / diceSum + " , " + diceThrees / diceSum + " , " +
                diceFours/diceSum + " , " + diceFives/diceSum + " , " + diceSixes/diceSum);
    }
}
