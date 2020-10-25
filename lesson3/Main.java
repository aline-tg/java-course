
public class Main {
    /**
    * Computes absolute value of a number
    * @param input Number to compute absolute value
    * @return The absolute value
    */

    static double absoluteValue(double input) {
    double output;
        if(input < 0){
            output = - input;
        } else {
            output = input;
        }
        return output;
    }

    /**
    * Computes tip of a meal
    * @param input Price of the meal
    * @return The tip value for the meal
    */
    static double calculateTip(double input) {
        return input * 0.15;
        }

    /**
    * Prints presentation with name selected
    * @param name Name to print the presentation
    * @return The text to be printed
    */
    static String nametagText(String name) {
        String text;
        text = "Hello, my name is " + name;
        return text;
        }
    
    /**
    * Converts from Fahrenheit to Celsius degrees.
    * @param tempF Temperature in degrees Fahrenheit.
    * @return Equivalent temperature in degrees Celsius.
    */
    static double fahrenheitToCelsius(double tempF) {
        double tempC;
        tempC = ((tempF - 32)*5)/9;
        return tempC;
        }
    
    /**
    * Prints a temperature in both Fahrenheit and Celsius degrees.
    * @param tempF Temperature in degrees Fahrenheit.
    */
    static void printTemperature(double tempF) {
        double tempC;
        tempC = fahrenheitToCelsius(tempF);
        System.out.println("F: " + tempF + " C: " + tempC);
        }
    

     /**
    * Random result base on dice-rolling rules for board game Monopoly.
    * @return the final value of dice-rolling
    */
    static int monopolyRolls() {
        int dice1 = rollDice(6);
        int dice2 = rollDice(6);

        if (dice1 != dice2){
            return dice1 + dice2;
        } else {
            int dice3 = rollDice(6);
            int dice4 = rollDice(6);
            return dice1 + dice2 + dice3 + dice4;
        }

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
       
        //public boolean isPrime(int n){
        //}

        //question 4
        System.out.println("Question 4"); 
        double teste1 = absoluteValue(10);
        double teste2 = absoluteValue(-1);
        System.out.println(teste1);
        System.out.println(teste2);

         //question 5
         System.out.println("Question 5"); 
         System.out.println(calculateTip(25.0));

         //question 6
         System.out.println("Question 6"); 
         System.out.println(nametagText("Aline"));

        //question 7
        System.out.println("Question 7"); 
        printTemperature(68);

        //question 8
        System.out.println("Question 8"); 
        System.out.println(monopolyRolls());
    }


} 