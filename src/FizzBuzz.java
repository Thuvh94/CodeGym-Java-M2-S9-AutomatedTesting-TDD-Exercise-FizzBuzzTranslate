public class FizzBuzz {
    public static String FizzBuzzTranslate(int number){
        String result;
        if(number % 3 == 0 && number % 5 == 0)
           return result = "FizzBuzz";
        else if (number % 5 == 0)
            return result = "Buzz";
        else if(number % 3 == 0)
            return result = "Fizz";
        else {
            return result = String.valueOf(number);
        }
    }
}
