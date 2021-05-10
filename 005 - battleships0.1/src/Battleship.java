
public class Battleship {

	private int [] locationCells;
	private int numHits;
	
	public String checkYourself(String guess){

		int g = Integer.parseInt(guess);
		String result = "miss";
		for (int i : locationCells){
			if (g == i){
				numHits++;
				if (numHits == locationCells.length){
					result = "kill";
					break;
				}
				else {
					result = "hit";
					break;
				}				
			}			
		}
		return result;
		
	}
	
	public void setLocationCells(int[] loc){
		locationCells = loc;
	}
	
	
}
