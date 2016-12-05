
public class HelloWorld {
	public static void main(String[]args){
		int[] array=parseOperand("5_3/4");
		for(int i=0;i<array.length;i++){
		System.out.println(array[i]);
		}
	}
	public static String[] test(String x){
		String[] strArray=x.split("_|/");
    	return strArray;
	}
	public static int[] parseOperand(String operand){
    	String[] strArray=operand.split("_|/");
    	int[] intArray={};
    	for(int i=0;i<strArray.length;i++){
    		intArray[i]=Integer.parseInt(strArray[i]);
    	}
    	
    	return intArray;
    }
}
