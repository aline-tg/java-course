public class Main {
    public static void main(String[] args){

        //question 3
        System.out.println("Question 3"); 
        int bankBalance = 500;
        bankBalance = bankBalance + 250;
        bankBalance = bankBalance - 100;
        System.out.println(bankBalance); 

        //question 4
        System.out.println("Question 4"); 
        System.out.println(2.0 * (5 / 2));

        //question 5
        System.out.println("Question 5"); 
        int day = 24;
        String month = "June";
        System.out.println("My birthday is on " + day + " of " + month);

        //question 6
        System.out.println("Question 6"); 
        String firstName = "Aline";
        String lastName = "Guerreiro";
        String fullName = firstName + " " + lastName;
        int numberLetters;
        numberLetters = fullName.length() - 1;
        System.out.println("Hello, my name is: " + fullName + ". \nThere are " + numberLetters + " letters in my name.");
    
        //question 7
        System.out.println("Question 7"); 
        Double farenheit = 68.0; //between 0 and 100
        Double celsius = ((farenheit - 32)*5)/9;
        System.out.println("The temperature in Farenheit is: " + farenheit + " and in Celsius: " + celsius);
    }
}