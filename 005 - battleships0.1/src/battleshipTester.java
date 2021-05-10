
public class battleshipTester {

	public static void main(String[] args) {
		Battleship b1 = new Battleship();
		int[] loc = {2,3,4}; 
		b1.setLocationCells(loc);
		
		String g1="1", g2="2", g3="3", g4="4";
		
		System.out.println(b1.checkYourself(g1));
		System.out.println(b1.checkYourself(g2));
		System.out.println(b1.checkYourself(g3));
		System.out.println(b1.checkYourself(g4));


	}

}
