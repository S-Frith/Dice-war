
import java.util.Scanner;
import java.util.Arrays;
// import java.lang.reflect.Array;
import java.util.Random;



public class App {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            Random rand = new Random();

            
      
      int userScore = 0;
      int cpuScore =0;

      System.out.println("****************************\n        Point system \n****************************");


      System.out.println("Fiver = 6 points, \nLarge straight = 5 points, \nFour of a kind = 4 points, \nSmall straight = 3 points, \nFull house = 2 points, \nThree of kind = 1 point, \nAnything else = 0 points! ");

            System.out.println("How many rounds would you like to play?: ");
            int rounds = scan.nextInt();

            
            for ( int x = 0; x < rounds; x++) {

                int [] userRolls = new int[5];
                int [] cpuRolls = new int[5];

                for (int i = 0; i < userRolls.length; i++) {
                    int diceRoll = rand.nextInt(6) +1;
                    
                    userRolls[i] = diceRoll;

                    // System.out.println(Arrays.toString(userRolls));

                } 
                Arrays.sort(userRolls);
                
                
                System.out.println(Arrays.toString(userRolls));


                if (userRolls[0] == userRolls[1] &&
            userRolls[0] == userRolls[2] &&
            userRolls[0] == userRolls[3] &&
            userRolls[0] == userRolls[4]){
                
                System.out.println("****************************\nYou have a Fiver well done!\n + 6 points\n****************************");
                userScore +=6;

            }else if (
            userRolls[0] == 1 &&
            userRolls[1] == 2 &&
            userRolls[2] == 3 &&
            userRolls[3] == 4 &&
            userRolls[4] == 5){

                System.out.println("****************************\nYou have a large straight!\n + 5 points\n****************************");
                userScore +=5;
            
            }else if(
            userRolls[0] == userRolls[1] &&
            userRolls[0] == userRolls[2] &&
            userRolls[0] == userRolls[3] ||
            userRolls[1] == userRolls[2] &&
            userRolls[1] == userRolls[3] &&
            userRolls[1] == userRolls[4]) {

                System.out.println("****************************\nYou have four of a kind!\n + 4 points\n****************************");
                userScore +=4;

            }else if(
            userRolls[0] == (userRolls[1]-1) &&
            userRolls[1] == (userRolls[2]-1) &&
            userRolls[2] == (userRolls[3]-1) 
            ||
            userRolls[1] == (userRolls[2]-1) &&
            userRolls[2] == (userRolls[3]-1) &&
            userRolls[3] == (userRolls[4]-1) 

            ){

                System.out.println("****************************\nYou have a small straight!\n + 3 points\n****************************");
                userScore +=3;


            }else if(
            userRolls[0] == userRolls[1] &&
            userRolls[2] == userRolls[3] &&
            userRolls[2] == userRolls[4] 
            ||
            userRolls[0] == userRolls[1] &&
            userRolls[0] == userRolls[2] &&
            userRolls[3] == userRolls[4]

            ){
                System.out.println("****************************\nYou have a full house!\n + 2 points\n****************************");
                userScore +=2;



            }else if(
            userRolls[0] == userRolls[1] &&
            userRolls[0] == userRolls[2] 
            ||
            userRolls[1] == userRolls[2] &&
            userRolls[1] == userRolls[3] 
            ||
            userRolls[2] == userRolls[3] &&
            userRolls[2] == userRolls[4] 
            ){
                System.out.println("****************************\nYou have three of a kind!\n + 1 point\n****************************");
                userScore +=1;



            }else{
                System.out.println("****************************\nsorry but you dont have anything!\n****************************");

            }


            for (int i = 0; i < cpuRolls.length; i++) {
                int diceRoll = rand.nextInt(6) +1;
                
                cpuRolls[i] = diceRoll;

                // System.out.println(Arrays.toString(userRolls));

            } 
            Arrays.sort(cpuRolls);
            
            
            System.out.println(Arrays.toString(cpuRolls));


            if (cpuRolls[0] == cpuRolls[1] &&
        cpuRolls[0] == cpuRolls[2] &&
        cpuRolls[0] == cpuRolls[3] &&
        cpuRolls[0] == cpuRolls[4]){
            
            System.out.println("****************************\nThe computer has a fiver!\n + 6 points\n****************************");
            cpuScore +=6;

        }else if (
        cpuRolls[0] == 1 &&
        cpuRolls[1] == 2 &&
        cpuRolls[2] == 3 &&
        cpuRolls[3] == 4 &&
        cpuRolls[4] == 5){

            System.out.println("****************************\nThe computer has a large straight!\n + 5 points\n****************************");
            cpuScore +=5;
        
        }else if(
        cpuRolls[0] == cpuRolls[1] &&
        cpuRolls[0] == cpuRolls[2] &&
        cpuRolls[0] == cpuRolls[3] ||
        cpuRolls[1] == cpuRolls[2] &&
        cpuRolls[1] == cpuRolls[3] &&
        cpuRolls[1] == cpuRolls[4]) {

            System.out.println("****************************\nThe computer has four of a kind!\n + 4 points\n****************************");
            cpuScore +=4;

        }else if(
        cpuRolls[0] == (cpuRolls[1]-1) &&
        cpuRolls[1] == (cpuRolls[2]-1) &&
        cpuRolls[2] == (cpuRolls[3]-1) 
        ||
        cpuRolls[1] == (cpuRolls[2]-1) &&
        cpuRolls[2] == (cpuRolls[3]-1) &&
        cpuRolls[3] == (cpuRolls[4]-1) 

        ){

            System.out.println("****************************\nThe computer has a small straight!\n + 3 points\n****************************");
            cpuScore +=3;


        }else if(
        cpuRolls[0] == cpuRolls[1] &&
        cpuRolls[2] == cpuRolls[3] &&
        cpuRolls[2] == cpuRolls[4] 
        ||
        cpuRolls[0] == cpuRolls[1] &&
        cpuRolls[0] == cpuRolls[2] &&
        cpuRolls[3] == cpuRolls[4]

        ){
            System.out.println("****************************\nThe computer has a full house!\n + 2 points\n****************************");
            cpuScore +=2;



        }else if(
        cpuRolls[0] == cpuRolls[1] &&
        cpuRolls[0] == cpuRolls[2] 
        ||
        cpuRolls[1] == cpuRolls[2] &&
        cpuRolls[1] == cpuRolls[3] 
        ||
        cpuRolls[2] == cpuRolls[3] &&
        cpuRolls[2] == cpuRolls[4] 
        ){
            System.out.println("****************************\nThe computer has three of a kind! \n + 1 point\n****************************");
            cpuScore +=1;



        }else{
            System.out.println("****************************\nThe computer doesn't have anything!\n****************************");

        }



        System.out.println("The scores stand at:");

        System.out.printf("User score: %d\nCpu score: %d\n", userScore, cpuScore);
        
        System.out.println("-----------Press enter--------------");
        try{
                    System.in.read();
                }catch(Exception e)
                {	e.printStackTrace();}



        
        
    }
    System.out.printf("User score: %d\nCpu score: %d\n", userScore, cpuScore);

    if( cpuScore > userScore){
        System.out.println("Cpu wins!");
    
    } else if (cpuScore < userScore){
        System.out.println("Player wins!");
    }else {
        System.out.println("No one wins, it's a draw!");
    }

    

        }
    }
}
