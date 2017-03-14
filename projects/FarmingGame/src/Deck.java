/*
 * Tyler Patterson
 * March 2017
 */

import java.util.Random;

public class Deck {

	private Card[] cards;
	private Random rand = new Random();
	private int index;

	public Deck() {
		cards = new Card[55];
		
		cards[0] = new Card("Christmas Vacation: Collect $1000 Christmas Bonus,"
				+ "Collect year's wage of $5000 as you pass.", 0, Card.TYPE.Space);
		cards[1] = new Card("January: Hibernate. Draw O.T.B", 1, Card.TYPE.Space);
		cards[2] = new Card("January: Bitter cold spell. PAY $500 if you own cows.", 2, Card.TYPE.Space);
		cards[3] = new Card("February: Stuck in a muddy corral. Draw Farmer's Fate.", 3, Card.TYPE.Space);
		cards[4] = new Card("February: Rainy day. Draw O.T.B", 4, Card.TYPE.Space);
		cards[5] = new Card("March: Becomes obvious your wheat has winter killed. PAY $2000 to replant.", 5, Card.TYPE.Space);
		cards[6] = new Card("March: Hurt your back. Go back to second week of January.", 6, Card.TYPE.Space);
		cards[7] = new Card("Spring Planting: Plant corn on time. Double corn yeild this year.", 7, Card.TYPE.Space);
		cards[8] = new Card("April: More rain. Field work shut down. PAY $500.", 8, Card.TYPE.Space);
		cards[9] = new Card("May: The whole valley is green. COLLECT $500.", 9, Card.TYPE.Space);
		cards[10] = new Card("May: Windstorm makes you replant corn. PAY $500.", 10, Card.TYPE.Space);
		cards[11] = new Card("May: Cut your hay just right. COLLECT $1000 bonus.", 11, Card.TYPE.Space);
		cards[12] = new Card("June: Good growing weather. COLLECT $500 bonus.", 12, Card.TYPE.Space);
		cards[13] = new Card("June: Dust storm. Draw Farmer's Fate.", 13, Card.TYPE.Space);
		cards[14] = new Card("Independence Day Bash!", 14, Card.TYPE.Space);
		cards[15] = new Card("July: Hot! Wish you were in the mountains. Draw O.T.B.", 15, Card.TYPE.Space);
		cards[16] = new Card("August: You're right on time and farming like a pro. Go to the fourth week of February. COLLECT your year's wage of $5000.", 16, Card.TYPE.Space);
		cards[17] = new Card("August: Finish wheat harvest with no breakdowns. COLLECT $500.", 17, Card.TYPE.Space);
		cards[18] = new Card("September: Sunny skies at the County Fair. Draw O.T.B.", 18, Card.TYPE.Space);
		cards[19] = new Card("Harvest Moon smiles on you. COLLECT $500.", 19, Card.TYPE.Space);
		cards[20] = new Card("October: Indian Summer. COLLECT $500.", 20, Card.TYPE.Space);
		cards[21] = new Card("October: Good Pheasant Hunting. Draw Farmer's Fate.", 21, Card.TYPE.Space);
		cards[22] = new Card("October: Annual Deer Hunt. Draw Farmer's Fate.", 22, Card.TYPE.Space);
		cards[23] = new Card("November: Good weather, harvest winding up. COLLECT $500.", 23, Card.TYPE.Space);
		cards[24] = new Card("December: Cold and dry, perfect Field Corn Harvesting. COLLECT $500.", 24, Card.TYPE.Space);
		//Farmer's Fate 25-34
		cards[25] = new Card("Income taxes due. PAY $7,000.", 0, Card.TYPE.FarmerFate);
		cards[26] = new Card("Russian sale boosts wheat prices. COLLECT $2,000.", 0, Card.TYPE.FarmerFate);
		cards[27] = new Card("Held some of your calves and the market jumped. COLLECT $2,000 if you have cows.", 0, Card.TYPE.FarmerFate);
		cards[28] = new Card("Marketing Co-op holds out for higher price. Processor gives in. COLLECT $1,000.", 0, Card.TYPE.FarmerFate);
		cards[29] = new Card("Oil Company pays you $100 per acre for Oil and Gas lease on your farm.", 0, Card.TYPE.FarmerFate);
		cards[30] = new Card("A leaking electrical motor at Feed Mill contaminates your load of feed with PCB. State Ag Inspector requires you to slaughter cows on your farm (not cows on lease range land) with no reimbursement.", 0, Card.TYPE.FarmerFate);
		cards[31] = new Card("Truckers strike delays Fruit in transport, lots of spoilage. PAY $1,000 per Fruit Acre.", 0, Card.TYPE.FarmerFate);
		cards[32] = new Card("Drought year! Go to the 2nd week of January. Do not collect your $5,000 year's wages.", 2, Card.TYPE.FarmerFate);
		cards[33] = new Card("Drought year! Go to the 2nd week of January. Do not collect your $5,000 year's wages.", 2, Card.TYPE.FarmerFate);
		cards[34] = new Card("Windy spring, didnt get your wheat sprayed. Weeds cut your wheat crop in half. Hold this card through Wheat Harvest for this year.", 0, Card.TYPE.FarmerFate);
		//O.T.B's 35-44
		cards[35] = new Card("NEIGHBOUR SELLS OUT: 10 acres of Hay at $2,000 per acre. Total $20,000.", 0, Card.TYPE.OTB);
		cards[36] = new Card("NEIGHBOUR SELLS OUT: 10 acres of Hay at $2,000 per acre. Total $20,000.", 0, Card.TYPE.OTB);
		cards[37] = new Card("NEIGHBOUR GOES BROKE: 5 acres of Fruit at $5,000 per acre. Total $25,000", 0, Card.TYPE.OTB);
		cards[38] = new Card("NEIGHBOUR GOES BROKE: 5 acres of Fruit at $5,000 per acre. Total $25,000", 0, Card.TYPE.OTB);
		cards[39] = new Card("NEIGHBOUR GOES BROKE: 5 acres of Fruit at $5,000 per acre. Total $25,000", 0, Card.TYPE.OTB);
		cards[40] = new Card("LIVESTOCK AUCTION: 10 pregnant cows at $500 each. Total $5,000.", 0, Card.TYPE.OTB);
		cards[41] = new Card("LIVESTOCK AUCTION: 10 pregnant cows at $500 each. Total $5,000.", 0, Card.TYPE.OTB);
		cards[42] = new Card("NEIGHBOUR SELLS OUT: 10 acres of Grain at $2,000 per acre. Total $20,000.", 0, Card.TYPE.OTB);
		cards[43] = new Card("NEIGHBOUR SELLS OUT: 10 acres of Grain at $2,000 per acre. Total $20,000.", 0, Card.TYPE.OTB);
		cards[44] = new Card("NEIGHBOUR SELLS OUT: 10 acres of Grain at $2,000 per acre. Total $20,000.", 0, Card.TYPE.OTB);
		//Operating Expense 45-54
		cards[45] = new Card("Fertilizer bill due: Pay $100 per acre.", 0, Card.TYPE.OperatingExpense);
		cards[46] = new Card("Equipment breakdown: Pay $500.", 0, Card.TYPE.OperatingExpense);
		cards[47] = new Card("Monthly electric bill due for irrigation pumping: Pay $500.", 0, Card.TYPE.OperatingExpense);
		cards[48] = new Card("Farm real estate taxes due: Pay $1,500.", 0, Card.TYPE.OperatingExpense);
		cards[49] = new Card("Veterinary bill due: Pay $500 if you own cows.", 0, Card.TYPE.OperatingExpense);
		cards[50] = new Card("Seed bill due: $3,000.", 0, Card.TYPE.OperatingExpense);
		cards[51] = new Card("Parts bill due: Pay $500.", 0, Card.TYPE.OperatingExpense);
		cards[52] = new Card("Farmowner's Insurance due: Pay $1,500.", 0, Card.TYPE.OperatingExpense);
		cards[53] = new Card("Equipment in the shop. The delay costs: Pay $1,000.", 0, Card.TYPE.OperatingExpense);
		cards[54] = new Card("Feed bill due: Pay $100 per cow.", 0, Card.TYPE.OperatingExpense);
		
	}

	public Card getCard() {
		Card card = cards[Game.position];
		return card;
	}
	
	public Card farmersFate() {
		index = rand.nextInt(34 - 25) + 25;
		Card card = cards[index];
		return card;
	}
	
	public Card oTB() {
		index = rand.nextInt(44 - 35) + 35;
		Card card = cards[index];
		return card;
	}
	
	public Card operateExpense() {
		index = rand.nextInt(54 - 45) + 45;
		Card card = cards[index];
		return card;
	}

}
