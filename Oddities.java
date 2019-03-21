import java.util.*;
public class Oddities{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		for(int i = 1; i <= x; i++){
			int numToCheck = input.nextInt();
			boolean isEven = false;
			if(numToCheck%2 == 0){
				isEven = true;
				System.out.print(" Even ");
			}
			else{
				isEven = false;
				System.out.print(" Odd");
			}
		}
	}

}
