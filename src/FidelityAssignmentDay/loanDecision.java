package FidelityAssignmentDay;
/*Bank Loan Approval Logic Write a method: String loan Decision(int age, int salary, int creditScore) Rules using nested if-else: 
 * If age ≥ 21 
 *  If salary ≥ 25000 
 *   If creditScore ≥ 700 print Approved
 *   Else print Rejected - Low credit score 
 *  Else print Rejected - Low salary 
 * Else print Rejected - Under age java code
 */
public class loanDecision {
	 public static String loanDecisions(int age, int salary, int creditScore) {

	        if (age >= 21) {

	            if (salary >= 25000) {

	                if (creditScore >= 700) {
	                    return "Approved";
	                } else {
	                    return "Rejected - Low credit score";
	                }

	            } else {
	                return "Rejected - Low salary";
	            }

	        } else {
	            return "Rejected - Under age";
	        }
	    }
	 public static void main(String[] args) {

	        int age = 25;
	        int salary = 30000;
	        int creditScore = 720;

	        String result = loanDecisions(age, salary, creditScore);

	        System.out.println("Loan Status: " + result);
	    }
}
