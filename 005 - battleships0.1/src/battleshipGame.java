import java.util.*;

public class battleshipGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfGuesses = 0;
		Battleship b1 = new Battleship();
		int randomNum = (int) (Math.random()*5);
		
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		b1.setLocationCells(locations);
		
		boolean isAlive = true;
		
		while (isAlive == true){
			System.out.println("enter a guess...");
			String guess = sc.nextLine();
			String result = b1.checkYourself(guess);
			System.out.println(result);
			numOfGuesses++;
			if (result == "kill"){
				isAlive = false;
			}
		}
		System.out.println("number of guesses " + numOfGuesses);
		
		
		
		
		
		
		
		

	}

}
