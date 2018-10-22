// Author: Simon Gajewski


import java.util.Scanner;

public class mealReceipt {

	public static void main(String[] args) {
		//BEFORE YOU START READING
		// I recognise that this is reeeaaallyyy inefficent and too many variables. The reason for 
		// that is because its just a bunch of band-aids on bad logic. It ended up working perfectly in 
		// the end though. Thats what matters right...
		// I also managed to get the output into nice boxes. Thats why its so much more 
		// complicated than it should be. You can start reading now
		// Now that im rereading my code I proabably shoulda added classes
		
		//This next bits for asking for things from user
		Scanner jawn = new Scanner(System.in);
		System.out.println("Welcome to the tax and tip calcuator");
		System.out.println("Press enter to continue");
		jawn.nextLine();
		System.out.println("Please enter the name of your appetizer: ");
		String appetizerName = jawn.nextLine();
		System.out.println("Please enter the price of your appetizer: ");
		String appetizerPrice = jawn.nextLine();
		System.out.println("Please enter the name of your entrée: ");
		String entréeName = jawn.nextLine();
		System.out.println("Please enter the price of your entrée: ");
		String entréePrice = jawn.nextLine();
		System.out.println("Please enter the name of your dessert: ");
		String dessertName = jawn.nextLine();
		System.out.println("Please enter the price of your dessert: ");
		String dessertPrice = jawn.nextLine();
		System.out.println("Please enter the percent Tip you would like to give: ");
		String tip = jawn.nextLine();
		//Parse everything
		Double appetizerPriceNum = Double.parseDouble(appetizerPrice);
		Double entréePriceNum = Double.parseDouble(entréePrice);
		Double dessertPriceNum = Double.parseDouble(dessertPrice);
		Double tipNum = Double.parseDouble(tip);
		
		//Making some useful Doubles
		Double totalBeforeTax = appetizerPriceNum + entréePriceNum + dessertPriceNum; //Find total
		Double tipMultiply = tipNum * totalBeforeTax;
		Double taxAmountNum = 0.06;
		Double taxOfMealNum = taxAmountNum * totalBeforeTax;
		Double totalAfterTaxPlusTip = totalBeforeTax * (1 + taxAmountNum) + tipMultiply; 
		//Rounding and multiplying by a hundred for rounding. I casted the output to be an int
		int totalInt = (int) Math.round(totalAfterTaxPlusTip*100);
		int dessertRoundInt = (int) Math.round(dessertPriceNum*100);
		int entréeRoundInt = (int) Math.round(entréePriceNum*100);
		int appetizerRoundInt = (int) Math.round(appetizerPriceNum*100);
		int totalBeforeTaxRoundInt = (int) Math.round(totalBeforeTax*100);
		int taxOfMealInt = (int) Math.round(taxOfMealNum*100);
		int tipMultiplyNum = (int) Math.round(tipMultiply*100);
		// turning things into doubles
		double totalDouble = totalInt;
		double dessertRoundDouble = dessertRoundInt;
		double entréeRoundDouble = entréeRoundInt;
		double appetizerRoundDouble = appetizerRoundInt;
		double totalBeforeTaxRoundDouble = totalBeforeTaxRoundInt;
		double taxOfMealDouble = taxOfMealInt;
		double tipMultiplyDouble = tipMultiplyNum;
		//Change the output to a double and divide it by 100 because rounding
		totalDouble /= 100;
		dessertRoundDouble /= 100;
		entréeRoundDouble /= 100;
		appetizerRoundDouble /= 100;
		totalBeforeTaxRoundDouble /= 100;	
		taxOfMealDouble /= 100;
		tipMultiplyDouble /= 100;
		//Converting into a string -- I initially did this to convert a long to a double since 
		//Math.round outputted longs from a double input. Then I casted Math.round to output an int
		//to make things nicer, therfore, this whole string thing is useless. Im too lazy to change it
		String a = totalDouble + "";
		String c = dessertRoundDouble + "";
		String d = entréeRoundDouble + ""; //Please dont give me a bad grade for variable names
		String e = appetizerRoundDouble + ""; //Its getting later and later and my creativity for 
		String f = totalBeforeTaxRoundDouble + ""; //names is now lacking
		String g = taxOfMealDouble + "";
		String h = tipMultiplyDouble + "";
		//Moved things back from a string
		appetizerPriceNum = Double.parseDouble(e);
		entréePriceNum = Double.parseDouble(d);
		dessertPriceNum = Double.parseDouble(c);
		taxOfMealNum = Double.parseDouble(g);
		totalAfterTaxPlusTip = Double.parseDouble(a);
		totalBeforeTax = Double.parseDouble(f);
		tipMultiply = Double.parseDouble(h);
		//String things for printf... Not sure why I did this because im sure there is a better way to do it
		String item = "Item:";
		String subtotal = "Subtotal:";
		String taxstr = "Tax:";
		String tiper = ("Tip @ " + tipNum + "%:");
		String totalstr = "Total:";
		//Print everything in nice rows
		System.out.printf("%14s\t", item);
		System.out.println("Price");
		
		System.out.printf("%14s\t", appetizerName);
		System.out.println("$" + appetizerPriceNum);
		
		System.out.printf("%14s\t", entréeName);
		System.out.println("$" + entréePriceNum);
		
		System.out.printf("%14s\t", dessertName);
		System.out.println("$" + dessertPriceNum);
		
		System.out.printf("%14s\t", subtotal);
		System.out.println("$" + totalBeforeTaxRoundDouble);
		
		System.out.printf("%14s\t", taxstr); //Tax 
		System.out.println("$" + (taxOfMealNum));
		
		System.out.printf("%14s\t", tiper); //Tip
		System.out.println("$" + (tipMultiply));
		
		System.out.printf("%14s\t", totalstr); // Total
		System.out.println("$" + totalAfterTaxPlusTip);
		
		
	}
	
	
	
}
