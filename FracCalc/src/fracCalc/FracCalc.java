package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
    	String equation;
    	String answer;
    	Scanner input=new Scanner(System.in);
        while(true){
        	System.out.println("type \"quit\" to exit.Enter you equation:");
        	equation=input.nextLine();
        	answer=produceAnswer(equation);
        	if(equation.equals("quit")){
        		break;
        	}
        }

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        
        return "";
    }
    
    public static String parseInput(String expression){
    	return "";
    }
    
    public
    
    public static int[] parseOperands(String wholeNumber, String denominator, String numerator){
    	
    	int[]={}
    	return "";
    }
    
    public static String toImproperFrac(String fraction){
    	
    	return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}