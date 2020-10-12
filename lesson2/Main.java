public class Main {
    public static void main(String[] args){

        //question 3
        System.out.println("Question 3"); 
        boolean canSeePlayer = true;
        boolean playerPoweredUp = true;
        if (canSeePlayer) {
            if (!playerPoweredUp) {
            System.out.println("Attack!");
            } else {
            System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
            }

        //question 4 
        System.out.println("Question 4");
        //Assume these can have any value:
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        //TODO: print "Let’s stay home." if its raining, snowing or
        //below 50 degrees and print "Let’s go out!" otherwise.
        if(isSnowing || isRaining || temperature < 50){
            System.out.println("Let's stay home");
        } else {
            System.out.println("Let's go out!");
        }
        
        //question 5
        System.out.println("Question 5");    
        //Assume this could have any value between 0 and 24:
        int time = 18;
        String timeOfDay;
        //TODO: set timeOfDay to the correct String value.
        
        if(time >= 5 && time < 12){
            timeOfDay = "morning";
        } else if (time >= 12 && time < 20){
            timeOfDay = "daytime";
        } else {
            timeOfDay = "night";
        }
        System.out.println(timeOfDay);    
            
        //question 6
        System.out.println("Question 6"); 
        //Assume these could have any value:
        int weekday = 5;
        boolean holiday = false;

        if ((weekday == 1 ||
            weekday == 2 ||
            weekday == 3 ||
            weekday == 4 ||
            weekday == 5 ||
            weekday == 6 ||
            weekday == 7) && holiday){
                    System.out.println("Sleep in!");
        } else if ( weekday == 6 ||  weekday == 7){
            System.out.println("Sleep in!");
        } else {  
                    System.out.println("Wake up at 7:00"); 
                }

        //question 8
        System.out.println("Question 8"); 
        
        //Assume this can have any value from 1 to 7:
        int dayOfWeek = 1;
        //TODO: declare a String variable called schedule.
        String schedule = "";
        
        //TODO: write a switch statement that give schedule a different
        switch(dayOfWeek){
            case 1: schedule = "Gym in the morning.";
                    break;
            case 2: schedule = "Class after work.";
                    break;
            case 3: schedule = "Meetings all day.";
                    break;
            case 4: schedule = "Work from home.";
                    break;
            case 5: schedule = "Game night after work.";
                    break;
            case 6: schedule = "Free!";
                    break;
            case 7: schedule = "Free!";
                    break;
            default:
                    schedule = "Free!";
                    break;
        }
        System.out.println(schedule);
        //value for each day of the week based on the dayOfWeek variable.
        //Don’t forget to "break" after each case, and don’t forget to
        //provide a default case!

        
    }
} 