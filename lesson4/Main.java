
public class Main {
    /**
    * Computes the factorial of 1 a n (number)
    * @param n Int number to compute the factorial
    * @return Factorial computed
    */
    static int factorial(int n) {
        int i = 1;
        int factorial = 1;

        while(i <= n){
            int aux = n;
            factorial = aux * factorial;
            n--;
        }
        return factorial;
    }
    
    /**
    * Gets the index of the first occurrence of a word in an array
    * @param StringArray is an array of strings
    * @param target word searched
    * @return -1 if doesn't find or the index of array
    */
    static int indexOfFirstOccurrence(String[] stringArray, String target)
    {
        int lengthArray = stringArray.length;

        for(int i=0; i<= (lengthArray - 1); i++){
            if(stringArray[i].equals(target)){
                return i;
            } 
        }
        return -1;
    }

    /**
    * Computes how many years it will take for you to have $1,000,000 on deposit given an initial value
    * @param initialBalance initial deposit on account
    * @return years quantity to achieve the 1 million goal
    */
    static int yearsTilOneMillion(double initialBalance) {
        int i = 0;
        while(initialBalance <= 1000000){
            initialBalance = initialBalance*1.05;
            i++;
        }
        return i;
        }
        
    /**
    * Prints the reverse of an array
    * @param stringArray array of string
    */
    static void printInReverse(String[] stringArray) {
        int lengthArray = stringArray.length;
        for(int i=(lengthArray-1);i>=0; i--){
            System.out.println(stringArray[i]);
        }
    }

    /**
    * Finds the range covered by an integer array
    * @param intArray array of integers
    * @return if array has length = 0, returns -1 if not returns the difference between the
    * greater number and the lesser number
    */
    static int findRange(int[] intArray) {
        int lengthArray = intArray.length;
        int maxValue = 0;
        int minValue = 0;

        if(lengthArray == 0) {
            return -1;
        } else {
            for(int i=0; i<= lengthArray-1; i++){
                if(intArray[i]>= maxValue){
                    maxValue = intArray[i];
                }
                if(intArray[i] <= minValue){
                    minValue = intArray[i];
                }
            }
            return (maxValue - minValue);
            }
        }

    /**
    * Random result base on dice-rolling rules for board game Monopoly.
    * @return the final value of dice-rolling
    */
    static int monopolyRolls() {
        int dice1 = rollDice(6);
        int dice2 = rollDice(6);
        int total = dice1 + dice2;
        while (dice1 == dice2) {
            dice1 = diceRoll(6);
            dice2 = diceRoll(6);
        total = total + dice1 + dice2;
        }
        return total;

        }
    
    /**
    * Random result for a dice-rolling accordly if its side quantity
    * @param sides Quantity of sides for a dice
    * @return Number of the dice-rolling for one dice
    */
    static int rollDice(int sides){
            // random num between 0 and (almost) 1
            double randomNumber=Math.random();
    
            // change range to 0 to (almost) 6
            randomNumber=randomNumber*sides;
    
            // shift range up one
            randomNumber=randomNumber+1;
    
            // cast to integer (ignore decimal part)
            // ex. 6.998 becomes 6
            int randomInt=(int)randomNumber;
    
            // return statement
            return randomInt;
            }
    public static void main(String[] args){

        //question 2
        System.out.println("Question 2"); 
        System.out.println(factorial(6));

        //question 3
        System.out.println("Question 3");
        String[] sentence = {"Learning", "Java", "is", "fun."};
        int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
        System.out.println(indexOfWordJava);
        
        //question 4
        System.out.println("Question 4");
        System.out.println(yearsTilOneMillion(500000));

        //question 5
        System.out.println("Question 5");
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        printInReverse(weekdays);

        //question 6
        System.out.println("Question 6");
        int[] intArray = {1, 0, 2, 3, -1, 2};
        System.out.println(findRange(intArray));
    }


} 