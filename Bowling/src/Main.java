import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        int userinput;
        int userinput2;


        Scanner keyboard = new Scanner(System.in);


        System.out.println("How many pins did you knock down on your first roll Player 1?");
        userinput = keyboard.nextInt();
        if (userinput < 10){
            System.out.println("How many pins did you knock down on your second roll Player 1?");
            userinput = keyboard.nextInt();
        }
        else if (userinput > 10){
            System.out.println("Error! Please enter your actual score!");
        }
        else {
            System.out.println("You got a Strike congrats!");
        }



        System.out.println("How many pins did you knock down on your first roll Player 2?");
        userinput2 =keyboard.nextInt();
        if (userinput2 < 10){
            System.out.println("How many pins did you knock down on your second roll Player 2");
            userinput2 = keyboard.nextInt();
        }
        else if ( userinput2 > 10){
            System.out.println("Error! Please enter your actual score!");
        }
        else {
            System.out.println("You got a Strike congrats!");
        }



    /*if(userinput == 10|| userinput2 == 10){
        System.out.println("");
    }*/
    }
}

