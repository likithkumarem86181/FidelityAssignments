package FidelityAssignmentDay;
/*
 * 1.Product Discount Write a method getFinalAmount(double amount, boolean is Member) using nested if-else:
 *  - If amount ≥ 1000 
 *  - If customer is member then give 20% discount
 *   - Else give 10% discount - 
 *   Else give no discount 
 * */
public class ProductDiscount {

	    public static double getFinalAmount(double amount, boolean isMember) {

	        if (amount >= 1000) {

	            if (isMember) {
	                return amount - (amount * 0.20);
	            } else {
	                
	                return amount - (amount * 0.10);
	            }

	        } else {
	            return amount;
	        }
	    }
	    public static void main(String[] args) {

	        double amount = 1200;
	        boolean isMember = true;

	        double finalAmount = ProductDiscount.getFinalAmount(amount, isMember);

	        System.out.println("Original Amount: " + amount);
	        System.out.println("Is Member: " + isMember);
	        System.out.println("Final Amount after discount: " + finalAmount);
	    }
	}
 
	    
	

