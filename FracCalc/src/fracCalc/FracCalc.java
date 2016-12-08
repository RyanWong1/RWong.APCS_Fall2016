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
        	if(equation.equals("quit")){
        		break;
        	}
        	answer=produceAnswer(equation);
        	System.out.println(answer);
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
    	int[] answer={};
        String[] tokens=parseInput(input);
        String operator=tokens[1];
        if(!operator.equals("+") &&
        	!operator.equals("-") &&
        	!operator.equals("*") &&
        	!operator.equals("/")){
        	return "ERROR:Input is an ivalid format";
        }
        int[] operand1=parseOperand(tokens[0]);
        int[] operand2=parseOperand(tokens[2]);
        if( operand1[2]==0 || operand2[2]==0){
        	return "ERROR: Cannot divide by zero.";
        }
        operand1=toImproperFrac(operand1);
        operand2=toImproperFrac(operand2);
        if(tokens[1].equals("-")){
        	answer=subtraction(operand1,operand2);
        }else if(tokens[1].equals("+")){
        	answer=addition(operand1,operand2);
        }else if(tokens[1].equals("*")){
        	answer=multiplication(operand1,operand2);
        }else if(tokens[1].equals("/")){
        	answer=division(operand1,operand2);
        }
        answer=simplify(answer);
        return formatAnswer(answer);
    }
    
    public static String[] parseInput(String expression){
    	String[] strArray=expression.split(" ");
    	return strArray;
    }
    
    public static int[] parseOperand(String operand){
    	String[] strArray=operand.split("_");
    	int[] intArray=new int[3];
    	String[] strArray2=null;
    	if(strArray.length==1){
    		intArray[0]=0;
    		strArray2=operand.split("/");
    	}else if(strArray.length>1){
    		 intArray[0]=Integer.parseInt(strArray[0]);
    		 strArray2=strArray[1].split("/");
    	}
    	if(strArray.length ==1 && strArray2.length==1){
    		intArray[2]=1;
    	}
    	
    	
    	for(int i=0;i<strArray2.length;i++){
    		intArray[i+1]=Integer.parseInt(strArray2[i]);
    	}
    	return intArray;
    }
    
    public static int[] toImproperFrac(int[] operand){
    	int[] improper=new int[2];
    	if(operand[0]<0){
	    	operand[1]*=-1;
    	}
    	improper[0]=operand[0]*operand[2]+operand[1];
	    improper[1]=operand[2];
    	return improper;
    }
    
    public static int[] subtraction(int[] operand1,int[] operand2){
    	int cd=getCD(operand1,operand2);
    	operand1=convertToCD(operand1,cd);
    	operand2=convertToCD(operand2,cd);
    	int[] difference={operand1[0]-operand2[0],cd};
    	return difference;
    }
    
    public static int[] addition(int[] operand1,int[] operand2){
    	int cd=getCD(operand1,operand2);
    	operand1=convertToCD(operand1,cd);
    	operand2=convertToCD(operand2,cd);
    	int[] sum={operand1[0]+operand2[0],cd};
    	return sum;
    }
    
    public static int[] multiplication(int[] operand1,int[] operand2){
    	if(operand1[0]<0 && operand2[0]<0){
    		operand1[0]*=-1;
    		operand2[0]*=-1;
    	}
    	int[] product={operand1[0]*operand2[0],operand1[1]*operand2[1]};
    	return product;
    }
    
    public static int[] division(int[] operand1,int[] operand2){
    	if(operand1[0]<0 && operand2[0]<0){
    		operand1[0]*=-1;
    		operand2[0]*=-1;
    	}
    	int[] quotient={operand1[0]*operand2[1],operand1[1]*operand2[0]};
    	return quotient;
    }
    
    public static int[] convertToCD(int[] operand, int cd){
    	int converter=cd/operand[1];
    	operand[0]=operand[0]*converter;
    	operand[1]=operand[1]*converter;
    	return operand;
    }
    
    public static int getCD(int[] operand1, int[] operand2){
    	return operand1[1]*operand2[1];
    }
    
    public static String formatAnswer(int[] answer){
    	if(answer[1]==0){
    		return answer[0]+"";
    	}else{
    		if(answer[0]==0){
    			if(answer[2]==1){
    				return answer[1]+"";
    			}else{
	    			return answer[1]+"/"+answer[2];
    			}
	    	}else{
	    		return answer[0]+"_"+answer[1]+"/"+answer[2];
	    	}
    	}
    }
    
    public static int[] simplify(int[] answer){
    	int gcf=1;
    	int[] simplified=new int[3];
    	if(answer[0]<0){            
    		answer[0]*=-1;
	    	if(answer[0]>=answer[1]){
	    		simplified[0]=answer[0]/answer[1];
	    		simplified[1]=answer[0]%answer[1];
	    		simplified[0]*=-1;
	    	}else{
	    		simplified[0]=0;
	    		simplified[1]=answer[0];
	    	}
	    	
    	}else{
    		if(answer[0]>=answer[1]){
	    		simplified[0]=answer[0]/answer[1];
	    		simplified[1]=answer[0]%answer[1];
	    	}else{
	    		simplified[0]=0;
	    		simplified[1]=answer[0];
	    	}
    	}
    	simplified[2]=answer[1];
    	for(int i=1;i<=simplified[1];i++){
    		if(simplified[1]%i==0 && simplified[2]%i==0){
    			gcf=i;
    		}
    	}
    	simplified[1]/=gcf;
    	simplified[2]/=gcf;
    	return simplified;
    }
    	
    
    
}
