/**
 * Exercise 5 (Homework) — Receipt, version 2
 *
 * Rebuild your Session 4 receipt, but this time:
 *   - Every price is stored in a variable
 *   - Every quantity is stored in a variable
 *   - Line totals are CALCULATED (price * quantity)
 *   - The grand total is CALCULATED (sum of line totals)
 *   - Nothing numeric is typed directly into the output string
 *
 * ⚠️ Watch your parentheses. "Total: " + price * qty will
 *    NOT do what you want if you get it wrong.
 *
 * Challenge: add an 8.875% sales tax line, rounded to 2 decimals.
 */
public class Receipt2 {
    public static void main(String[] args) {
        double shirtPrice = 6.99;
        int shirtQuantity = 20;
        double underwearPrice = 45.00;
        int underwearQuantity = 30;
        double flipflopsPrice = 200.00;
        int flipflopsQuantity = 1;
        
        double totalBeforeTax = (shirtPrice*shirtQuantity) + (underwearPrice*underwearQuantity) + (flipflopsPrice*flipflopsQuantity);
        double totalAfterTax = ((totalBeforeTax*.08875)+totalBeforeTax);
        System.out.println("Total: $" + Math.round(totalAfterTax*100.0)/100.0);
    }
}
