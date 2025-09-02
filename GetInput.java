import java.util.Scanner;

public class GetInput {

    public static void main(String[] args) {
        
        //get two integers from the user and add them together. Display the equation and the result.
        //You may assume no invlaid input will be given.
        //Refer to https://www.w3schools.com/java/java_user_input.asp for input
        //Remember, do NOT press F5 to run. You must use the Run | Degbug links above the class name or input
        //will not work!
        //Sample output:

        int x,y = 0;

        String rawInput = "";

        java.util.Scanner myInput = new Scanner(System.in);

        System.out.print("First number: ");
        rawInput = myInput.nextLine();
        x = Integer.parseInt(rawInput);
        System.out.print("Second number: ");
        rawInput = myInput.nextLine();
        y = Integer.parseInt(rawInput);

        System.out.println("The value of " + x + " + " + y + " is " + (x+y));
        


    }

}
