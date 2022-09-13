package lottery;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Lottery {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         ArrayList<Integer> list = new ArrayList<Integer>();
         ArrayList<Integer> Wronglist = new ArrayList<Integer>();
        // TODO code application logic here

        Integer [] value = new Integer[5];
        for(int i = 0; i < 5 ; i++){
            value[i] = (int) (Math.random() * 5);
            System.out.print("");
        
        }
        
        
        
        int number = 5;
        int guess = 0;
        System.out.println("Welcome to the Game of Lottery, you have six random numbers to guess in five tries, If you guess all the numbers within the amount of tries you win the game");
        System.out.println("At the end of the Game you will be given the solution as well as the numbers you chose");
        System.out.println("\n");
        System.out.println("Do you agree with the rules before we start?:");
        
        String agree = input.next();
        
 
        
        System.out.println("\n");
        if(agree.equals("Yes")|| agree.equals("yes")){
          System.out.println("You have " + number + " tries left");
          System.out.println("\n");
            
                 
            
        while(guess < value.length){
            System.out.println("Pick: a number: ");
            int red = Integer.valueOf(input.next());
            System.out.println("\n");
            
            if(!(value[guess] == red)){
                Wronglist.add(red);
                number = number - 1;
                System.out.println("You have " + number + " tries left");
                System.out.println("\n");
                
            }
            
            else{    
             
                list.add(red);
                System.out.println("\n");
                System.out.println("Correct " + list + "\n");
                guess = guess + 1;   
            
            } 
            
            Integer [] array = list.toArray(new Integer[0]);
              
            if(Arrays.equals(array, value)){
                System.out.println("\n");
               System.out.println("Game Over, You Win");
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("Results: " + list);
            
                System.out.println("Solution: " + Arrays.toString(value));
                break;
                }
               
                else if(number == 0 || guess >= value.length ){
                
                  System.out.println("Game Over, Try Again Next Time");
                  System.out.println("\n");
                  System.out.println("Results: " + "(Wrong Answers)" + Wronglist + "(Answred Correctly)" + list);
                  System.out.println("Solution: " + Arrays.toString(value));
                  break;
            
              }
                
              
            }
        }
        else{
        System.out.println("Ok, Thank You for Participating");
        System.out.println("\n");
        System.out.println("Goodbye");    
        }
        
                       
            
            
        }

    private static void shuffleArray(Integer[] value) {        
    
    for (int i = value.length - 1; i > 0; i--)
    {
        Random random = new Random();
       int index = random.nextInt(i + 1);
       int temp = value[index];
        value[index] = value[i];
        value[i] = temp;
    }
    }
        
    // If running on Java 6 or older, use `new Random()` on RHS here
    
    

}
    
