//Ryan Wong
//10-5-16

import java.util.Scanner;
public class Collab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int largestEven=0;
		int evenSum=0;
		int min=0;
		int max=0;
		System.out.println("How many numbers do you want to input?:");
		int rounds=input.nextInt();
		System.out.println("Enter "+rounds+" of numbers.");
		for(int i=1;i<=rounds;i++){
			int user=input.nextInt();
			if(user%2==0){
				evenSum+=user;
			}
			if(user>max){
				max=user;
			}
			if(i==1){
				min=user;
			}
			if(user<min){
				min=user;
			}
			if(user%2==0 && user>largestEven){
				largestEven=user;
			}
		}
		System.out.println("The maximun is: "+max);
		System.out.println("The minimum is:"+ min);
		System.out.println("The sum of all even numbers is: "+evenSum);
		System.out.println("The largest even number is: "+largestEven);
	}

}
