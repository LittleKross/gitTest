import java.util.*;
public class Oddities{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i <= num; i++){
			int numToCheck = input.nextInt();
			boolean isEven = false;
			if(numToCheck == 0){
				System.out.println("hi!");
			}
			else if(numToCheck == (int)(2*(numToCheck/2))){
				isEven = true;
				System.out.println(" Even ");
			}
			else{
				isEven = false;
				System.out.println(" Odd");
			}
		}
	}

}
