import java.util.Scanner;
public class Hourglass {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How fat do you want the Hourglass to be?");
		int width=input.nextInt();
		printBase(width); //Print the firstline
		topHalf(width);
		
		bottomHalf(width);
		printBase(width);//Print the top half



	}

	public static void topHalf(int width){
		int counter;
		for (int i=1; i <=4; i++){//print each line
			//print spaces
			counter=5-i;
			for (int j=1; j<=i; j++){
				System.out.print(" ");
			}
			System.out.print("\\");
			while (counter>0) { 
				System.out.print("::");
				counter--;
			}
			System.out.println("/");
		}
	}

	public static void bottomHalf(int width){
		int counter;
		for (int i=4; i >=1; i--){//print each line
			//print spaces
			counter=5-i;
			for (int j=i; j>=1; j--){
				System.out.print(" ");
			}
			System.out.print("/");
			while (counter>0) { 
				System.out.print("::");
				counter--;
			}
			System.out.println("\\");
		}
	}

	public static void printBase(int width){
		System.out.print("|");
		for (int i = 1; i<=10;i++){
			System.out.print("\"");
		}
		System.out.println("|");
	}


}
