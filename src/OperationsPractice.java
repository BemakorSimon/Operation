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
		Double totalAfterTaxPlusTip = totalBeforeTax * 1.06 + tipMultiply; 
		//Rounding
		long totalLong = Math.round(totalAfterTaxPlusTip*100);
		
		long dessertRoundLong = Math.round(dessertPriceNum*100);
		long entréeRoundLong = Math.round(entréePriceNum*100);
		long appetizerRoundLong = Math.round(appetizerPriceNum*100);
		long totalBeforeTaxRoundLong = Math.round(totalBeforeTax*100);
		
		String a = totalLong/100 + "";
		
		String c = dessertRoundLong/100 + "";
		String d = entréeRoundLong/100 + "";//Mess with this to change decimle points
		String e = appetizerRoundLong/100 + "";
		String f = totalBeforeTaxRoundLong/100 + "";
		
		appetizerPriceNum = Double.parseDouble(e);
		entréePriceNum = Double.parseDouble(d);
		dessertPriceNum = Double.parseDouble(c);
		
		totalAfterTaxPlusTip = Double.parseDouble(a);
		double totalBeforeTaxRound = Double.parseDouble(f);
		
		String item = "item:";
		String subtotal = "Subtotal:";
		String taxstr = "Tax:";
		String tiper = ("Tip @ " + tipNum + "%");
		String totalstr = "Total:";
		
		System.out.printf("%10s\t", item);
		System.out.println("Price");
		
		System.out.printf("%10s\t", appetizerName);
		System.out.println("$" + appetizerPriceNum);
		
		System.out.printf("%10s\t", entréeName);
		System.out.println("$" + entréePriceNum);
		
		System.out.printf("%10s\t", appetizerName);
		System.out.println("$" + appetizerPriceNum);
		
		System.out.printf("%10s\t", dessertName);
		System.out.println("$" + dessertPriceNum);
		
		System.out.printf("%10s\t", subtotal);
		System.out.println("$" + totalBeforeTaxRound);
		
		System.out.printf("%10s\t", taxstr); //Tax 
		System.out.println("$" + (totalBeforeTax * 0.06));
		
		System.out.printf("%10s\t", tiper); //Tip
		System.out.println("$" + (tipNum * totalBeforeTaxRound));
		
		System.out.printf("%10s\t", totalstr); // Total
		System.out.println("$" + totalAfterTaxPlusTip);
		
		
	}
	
	
	
}
