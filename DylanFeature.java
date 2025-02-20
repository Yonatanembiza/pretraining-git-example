public class DylanFeature {

    public String fizzBuzz(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return "It's not!";
        }
    }

    private boolean isPlindrome(String input) {
        String inputWord = input.toLowerCase();
        StringBuilder reversedWord = new StringBuilder(inputWord).reverse();
        if (inputWord.equals(reversedWord.toString())) {
            return true;
        }
        return false;
    }
}
