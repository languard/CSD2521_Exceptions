public class Convert {

    public static void main(String[] args) {
        //This file is the file used with the video lecture - https://youtu.be/OceRe6ZEA70

        try
        {
            int x = Integer.parseInt("4.4");
            System.out.println("Valid string!");
        }
        catch(Exception e)
        {
            System.out.println("Error! Message is: ");
            System.out.println(e.toString());            
        }

        System.out.println("Done!");

        //DivideNumbers(5, 0);


    }

    public static void DivideNumbers(int value1, int value2)
    {
        int result = Integer.MIN_VALUE;
        boolean isValid = true;

        try
        {
            result = value1 / value2;
        }
        catch(Exception e)
        {
            isValid = false;
        }

        if(isValid == false)
        {
            System.out.println("There was an error doing the division");
        }
        else
        {
            System.out.println("The answer is: " + result);
        }
    }
    
}
