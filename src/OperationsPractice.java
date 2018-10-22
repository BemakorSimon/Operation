import java.util.Scanner;

public class mealReceipt {

	public static void main(String[] args) {
		
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
		
		
		Double totalBeforeTax = appetizerPriceNum + entréePriceNum + dessertPriceNum; //Find total
		Double tipMultiply = tipNum * totalBeforeTax;
		Double taxAmountNum = 0.06;
		Double taxOfMealNum = taxAmountNum * totalBeforeTax;
		Double totalAfterTaxPlusTip = totalBeforeTax * (1 + taxAmountNum) + tipMultiply; 
		//Rounding
		int totalInt = (int) Math.round(totalAfterTaxPlusTip*100);
		int dessertRoundInt = (int) Math.round(dessertPriceNum*100);
		int entréeRoundInt = (int) Math.round(entréePriceNum*100);
		int appetizerRoundInt = (int) Math.round(appetizerPriceNum*100);
		int totalBeforeTaxRoundInt = (int) Math.round(totalBeforeTax*100);
		int taxOfMealInt = (int) Math.round(taxOfMealNum*100);
		int tipMultiplyNum = (int) Math.round(tipMultiply*100);
		
		double totalDouble = totalInt;
		double dessertRoundDouble = dessertRoundInt;
		double entréeRoundDouble = entréeRoundInt;
		double appetizerRoundDouble = appetizerRoundInt;
		double totalBeforeTaxRoundDouble = totalBeforeTaxRoundInt;
		double taxOfMealDouble = taxOfMealInt;
		double tipMultiplyDouble = tipMultiplyNum;
		
		totalDouble /= 100;
		dessertRoundDouble /= 100;
		entréeRoundDouble /= 100;
		appetizerRoundDouble /= 100;
		totalBeforeTaxRoundDouble /= 100;	
		taxOfMealDouble /= 100;
		tipMultiplyDouble /= 100;
		
		String a = totalDouble + "";
		String c = dessertRoundDouble + "";
		String d = entréeRoundDouble + "";//Mess with this to change decimle points
		String e = appetizerRoundDouble + "";
		String f = totalBeforeTaxRoundDouble + "";
		String g = taxOfMealDouble + "";
		String h = tipMultiplyDouble + "";
		
		appetizerPriceNum = Double.parseDouble(e);
		entréePriceNum = Double.parseDouble(d);
		dessertPriceNum = Double.parseDouble(c);
		taxOfMealNum = Double.parseDouble(g);
		totalAfterTaxPlusTip = Double.parseDouble(a);
		totalBeforeTax = Double.parseDouble(f);
		tipMultiply = Double.parseDouble(h);
		
		String item = "Item:";
		String subtotal = "Subtotal:";
		String taxstr = "Tax:";
		String tiper = ("Tip @ " + tipNum + "%:");
		String totalstr = "Total:";
		
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
