
import java.util.Scanner;
// import java.util.Arrays;
// import java.lang.reflect.Array;
// import java.util.Random;

public class AppTest {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            // Random rand = new Random();


            //fiver
            // int userRolls [] = {1,1,1,1,1};
            
            //long straight
            // int userRolls [] = {1,2,3,4,5};
            
            //four of a kind
            // int userRolls [] = {1,1,1,1,6};
            // int userRolls [] = {1,6,6,6,6};
            
            //small striaght
            // int userRolls [] = {1,2,3,4,4};
            // int userRolls [] = {2,2,3,4,5};

            //full house
            // int userRolls [] = {2,2,3,3,3};
            // int userRolls [] = {2,2,2,3,3};

            // three of a kind
            // int userRolls [] = {2,2,2,3,5};
            // int userRolls [] = {1,2,2,2,3};
            int userRolls [] = {1,2,3,3,3};


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