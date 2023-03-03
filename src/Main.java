import java.util.Scanner;//import scanner
import java.util.Random;//import random number


public class Main {
    public static void main(String[] args){
        Random rnd = new Random();//variable for random number
        Scanner in = new Scanner(System.in);//variable for user input

        String firstMove = "";
        boolean done = true;
        String YNResp;
        int point = 0;
        int crapsCheck = 0;


        System.out.println("Roll the dice (roll) ");//output to user asking to roll the dice
        firstMove = in.nextLine();//saves user input
        do {//do this block of code

        while (!firstMove.equalsIgnoreCase("roll"))//loop to bullet proof user input, loop until valid answer of "roll" is given
        {
            System.out.println("that was an invalid input: " + firstMove);//ouput for invalid move
            System.out.println("try again");
            firstMove = in.nextLine();//clear buffer

        }
        int die1 =  rnd.nextInt(6)+1;//initialize die1 to random number 1 -6
        int die2 = rnd.nextInt(6)+1;//initialize die2 to random number 1-6
        int crapsRoll = die1 + die2;//add die1 and die2 together store as crapsRoll



            if (crapsRoll == 7 || crapsRoll == 11 )//if roll is eqal to 7 or 11 run this block of code
            {System.out.println("You rolled an:" + die1 + "+" + die2 + "=" + crapsRoll);
            System.out.println("You win!");}
               else if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)//else if run this block of code
                {
                    System.out.println("You rolled a: " + die1 + "+" + die2 + "=" + crapsRoll);
                    System.out.println("you have crapped out, you lose!");}
                    else//else run this block
                        { point = crapsRoll;//store crapsRoll as the point
                        System.out.println("you have rolled a: " + crapsRoll + ". " +die1+ "+" + die2 + "=" +crapsRoll );//output to user what they rolled

                       do {//do this block while roll is not equal to the point, and not equal to 7
                           die1 = rnd.nextInt(6) + 1;//rolls die1 again
                           die2 = rnd.nextInt(6) + 1;//rolls die2 again
                           crapsCheck = die1 + die2;//save new sum as crapsCheck


                           System.out.println("point is : " + point);
                           System.out.println("trying for point: " + die1 + "+" + die2 + "=" + crapsCheck);//output to user they are trying for the point
                       }while (crapsCheck != point && crapsCheck != 7);
                           if (crapsCheck == point) {//run this if crapsCheck = point
                               System.out.println("You have made a point");
                               System.out.println("You win!!");

                           } else if (crapsCheck == 7) {//run this block if a 7 is rolled
                               System.out.println("you have rolled a 7");
                               System.out.println("You have lost!");
                           }



                    }

                    System.out.println("Would you like to play again? [Y / N}");//output to user asking if they would like to play again
                    YNResp = in.nextLine();//store user input

                        if (YNResp.equalsIgnoreCase("N")) {//if user inputs N exit the program
                            System.exit(0);
                        }
                        else if (YNResp.equalsIgnoreCase("Y"))// if user says Y then change done false
                            done = false;
                        else if (!YNResp.equalsIgnoreCase("N") || (!YNResp.equalsIgnoreCase("y"))){//bullet proofing for user input
                            System.out.println("that was an invalid input " + YNResp);
                            System.out.println("try again!");
                        in.nextLine();}




} while(!done);//stop looping the do if false

    }
}