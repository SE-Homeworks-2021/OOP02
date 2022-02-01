package lab.oodp.control;

public class ComplexUtils {
	/**
	 * Q1. Compare two names and if they are the same return "Same name", otherwise
	 * if they start with exactly the same letter return "Same first letter",
	 * otherwise return "No match".
	 *
	 * @param firstName
	 * @param secondName
	 *
	 * @return one of three Strings: "Same name", "Same first letter", "No match"
	 */
	public String areSameName(String firstName, String secondName) {

		String message = "";
		
		if(firstName.equals(secondName))
		{
			message = "Same name";
		}
		else if(firstName.charAt(0) == secondName.charAt(0))
		{
			message = "Same first letter";
		}
		else
		{
			message = "No match";
		}
		//TODO: implement here

		return message;
	}

	/** areSameName(String, String) => String **/

	/**
	 * Q2. Determine if the given year is a leap year.
	 *
	 * @param year
	 *
	 * @return true if the given year is a leap year, false otherwise
	 */
	public boolean isALeapYear(int year) {
		boolean leapYear = false;

		//TODO: implement here
		
		
	    if (year % 4 == 0) {

	     
	      if (year % 100 == 0) {

	        
	        if (year % 400 == 0)
	        	leapYear = true;
	        else
	        	leapYear = false;
	      }
	      
	      // if the year is not century
	      else
	    	  leapYear = true;
	    }

		return leapYear;
	}


	/**
	 * Q3. Return the given string in reverse order.
	 *
	 * @param str
	 *
	 * @return the String with characters in reverse order
	 */
	public String reverseString(String str) {
		String reverseStr = "";

		//TODO: implement here
		
		for(int i=str.length()-1; i>=0; --i)
		{
			
			reverseStr += str.charAt(i);
		}

		return reverseStr;
	}

	/** reverseString(String) => void **/



	/**
	 * Q4. Determine if the given number is a prime number.
	 *
	 * @param num
	 *
	 * @return true is the given number is a prime, false otherwise
	 */
	public boolean isPrime(int num) {
		//TODO: implement here
		
		for (int i = 2; i <= num / 2; ++i) {
		      
		      if (num % i == 0) {
		    	  return false;
		      }
		      
		    }
		if (num <= 1)
		{
			return false;
		}
		
		return true;
	}

	/**
	 * Q5. Determine if the given string is a palindrome (case folded).
	 *
	 * @param str
	 *
	 * @return true if string is palindrome, false otherwise
	 */
	public boolean isStringPalindrome(String str) {
		//TODO: remove return and implement here 
		
		if(str.equals(reverseString(str)))
		{
			return true;
			
		}
		
		else
		{
			return false;
		}
	}

	/** isStringPalindrome(String) => boolean **/

	/**
	 * Q10. Generate a space separated list of all the prime numbers from 2 to the
	 * highest prime less than or equal to the given integer.
	 *
	 * @param num
	 *
	 * @return the primes as a space separated list
	 */
	public String printPrimeNumbers(int num) {
		
		String primesStr = "";
		//TODO: implement here
		
		if(num < 2)
		{
			return "No prime number found";
		}
		
		for(int i = 2; i<= num; i++)
		{
			if(isPrime(i))
			{
				primesStr += Integer.toString(i)+" ";
				
			}
		}
		primesStr = primesStr.substring(0,primesStr.length()-1);
		return primesStr;
		
	}
	
	public static void main(String[] args) 
	{
		ComplexUtils test = new ComplexUtils();
//		
//		System.out.println("i did, did i");
//		System.out.println(test.reverseString("i did, did i"));
//		

//		String kim = test.printPrimeNumbers(20);
//		
//		System.out.print(kim);
		
	}
}
