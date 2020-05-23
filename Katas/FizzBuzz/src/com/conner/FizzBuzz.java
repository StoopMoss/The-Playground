
import java.util.*;
import javax.swing.text.StyledEditorKit.BoldAction;
import java.lang.*;

public class FizzBuzz {

	public static void main(String[] args){
		FizzBuzzTests.printResult(FizzBuzzTests.shouldReturnStringWhenGivenInt(), "shouldReturnStringWhenGivenInt");
		FizzBuzzTests.printResult(FizzBuzzTests.shouldReturnFizzWhenGivenMultipleOfThree(), "shouldReturnFizzWhenGivenMultipleOfThree");
		FizzBuzzTests.printResult(FizzBuzzTests.shouldReturnBuzzWhenGivenMultipleOfFive(), "shouldReturnBuzzWhenGivenMultipleOfFive");
		FizzBuzzTests.printResult(FizzBuzzTests.shouldReturnFizzBuzzWhenGivenMultipleOfFifteen(), "shouldReturnFizzBuzzWhenGivenMultipleOfFifteen");
	}

	public static String run(Integer number) {
		if (number % 15 == 0) {
			return "FizzBuzz";
		} else if (number % 3 == 0) {
			return "Fizz";
		} else if (number % 5 == 0) {
			return "Buzz";
		} else 
		return number.toString();
	}
}
