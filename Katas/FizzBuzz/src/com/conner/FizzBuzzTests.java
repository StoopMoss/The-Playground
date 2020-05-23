 
//import static org.junit.Assert.*;
//import org.junit.Test;
 
public class FizzBuzzTests {
 
    //@Test
    public void testTest(){
      System.out.println("THis is another class");  
    }

    public static void printResult(Boolean bool, String testName){
      System.out.println(testName);	
      if (bool) {
        System.out.println("Passed");	
      } else {
        System.out.println("** Failed **");
      }
    }

    public static boolean shouldReturnStringWhenGivenInt(){		
      if (!Util.stringCompare(FizzBuzz.run(1), "1")){
        return false;
      } else if (!Util.stringCompare(FizzBuzz.run(2), "2")) {
        return false;
      }
      return true;
    }
  
    public static boolean shouldReturnFizzWhenGivenMultipleOfThree() {
      if (Util.stringCompare(FizzBuzz.run(3), "Fizz") 
        && Util.stringCompare(FizzBuzz.run(6), "Fizz") 
        && Util.stringCompare(FizzBuzz.run(9), "Fizz") ) { 
        return true;
      }
      return false;
    }
  
  
    public static boolean shouldReturnBuzzWhenGivenMultipleOfFive() {
      if (Util.stringCompare(FizzBuzz.run(5), "Buzz") 
        && Util.stringCompare(FizzBuzz.run(10), "Buzz") 
        && Util.stringCompare(FizzBuzz.run(20), "Buzz") ) { 
        return true;
      }
      return false;
    }
  
    public static boolean shouldReturnFizzBuzzWhenGivenMultipleOfFifteen() {
      if (Util.stringCompare(FizzBuzz.run(15), "FizzBuzz")
        && Util.stringCompare(FizzBuzz.run(30), "FizzBuzz")
        && Util.stringCompare(FizzBuzz.run(45), "FizzBuzz")){
        return true;
      }
      return false;
    }
}