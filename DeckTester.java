/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		String[] ranks = new String[4];
      String[] suits = new String[4];
      int[] pointValues = new int[4];
		
		ranks = {"jack", "queen", "king", "ace"};

	   suits = {"hearts", "clubs", "spades", "diamonds"};

		pointValues = {10, 11, 12, 13};

		Deck deck1 = new Deck(ranks, suits, pointValues);
		Deck deck2 = new Deck(ranks, suits, pointValues);
		Deck deck3 = new Deck(ranks, suits, pointValues);
		
		System.out.println(deck1.deal());
		
		
		
	}
}