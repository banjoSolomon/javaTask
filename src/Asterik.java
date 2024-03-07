import java.util.*;
public class Asterik {
    public static <userInput> void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int userInput = input.nextInt();
       // ArrayList<userInput> numbers = new ArrayList<>();
        while(userInput != 22){
            System.out.print("Enter any number: ");
             userInput = input.nextInt();
             if(userInput > 1 & userInput <= 15){
                 System.out.print("Valid");


                 for( int count  = 0; count < userInput; count++){
                     System.out.print("*");
                 }

             }

        }

    }


}
