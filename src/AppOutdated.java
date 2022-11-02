
import java.util.Scanner;
import java.util.Arrays;
// import java.lang.reflect.Array;
import java.util.Random;

public class AppOutdated {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            Random rand = new Random();
      
    //   int userScore = 0;
    //   int cpuScore =0;

      
            System.out.println("How many round would you like to play?: ");
            int rounds = scan.nextInt();

            
            for ( int x = 0; x < rounds; x++) {

                int [] userRolls = new int[5];
                
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
                
                System.out.println("You have a Fiver well done!");

            }else if (
            userRolls[0] == 1 &&
            userRolls[1] == 2 &&
            userRolls[2] == 3 &&
            userRolls[3] == 4 &&
            userRolls[4] == 5){

                System.out.println("You have a large straight!");
            
            }else if(
            userRolls[0] == userRolls[1] &&
            userRolls[0] == userRolls[2] &&
            userRolls[0] == userRolls[3] ||
            userRolls[1] == userRolls[2] &&
            userRolls[1] == userRolls[3] &&
            userRolls[1] == userRolls[4]) {

                System.out.println("You have four of a kind!");

            }else if(
            userRolls[0] == (userRolls[1]-1) &&
            userRolls[1] == (userRolls[2]-1) &&
            userRolls[2] == (userRolls[3]-1) 
            ||
            userRolls[1] == (userRolls[2]-1) &&
            userRolls[2] == (userRolls[3]-1) &&
            userRolls[3] == (userRolls[4]-1) 

            ){

                System.out.println("You have a small straight!");


            }else if(
            userRolls[0] == userRolls[1] &&
            userRolls[2] == userRolls[3] &&
            userRolls[2] == userRolls[4] 
            ||
            userRolls[0] == userRolls[1] &&
            userRolls[0] == userRolls[2] &&
            userRolls[3] == userRolls[4]

            ){
                System.out.println("You have a full house!");



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
                System.out.println("You have three of a kind!");



            }else{
                System.out.println("sorry but you dont have anything!");

            }


            }
        }
    }
}




                


                
//                 int cpuChoice = rand.nextInt(6) +1;
                

//                 System.out.printf("Your number is: %d\n", userChoice);

//                 System.out.println("do you think the Cpu's number is higher(1) or lower(0) than yours? ");
//                 int selection = scan.nextInt();

//                 System.out.printf("You selected  %d\n", selection);




                
//                 if (cpuChoice > userChoice) {
//                     if (selection == 1) {
//                         System.out.printf("Correct! The Cpu's numebr was: %d\n", cpuChoice);
//                         userScore +=1;

//                     }else if (selection == 0) {
//                         System.out.printf("Incorrect! The Cpu's numebr was: %d\n", cpuChoice);
//                         cpuScore +=1;
//                     }

//                 } else if (cpuChoice < userChoice) {
//                     if (selection == 0){
//                         System.out.printf("Correct! The Cpu's number was: %d\n", cpuChoice);
//                         userScore +=1;
                    
//                     }else if(selection == 1){
//                         System.out.printf("Incorrect! The Cpu's number was: %d\n", cpuChoice);
//                         cpuScore +=1;
//                     }
                    
//                 }






//             }
            
            
            
            
            
            
//             System.out.printf("User score: %d\nCpu score: %d\n", userScore, cpuScore);


//             if( cpuScore > userScore){
//                 System.out.println("Cpu wins!");

//             } else if (cpuScore < userScore){
//                 System.out.println("Player wins!");
//             }else {
//                 System.out.println("No one wins, it's a draw!");

//              }
//          }




//    }
// }
