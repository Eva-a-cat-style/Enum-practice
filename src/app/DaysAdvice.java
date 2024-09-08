package app;

public class DaysAdvice implements Motivator{

    @Override
    public void advice(Day day){
        switch (day){
            case MONDAY, TUESDAY,WEDNESDAY,THURSDAY:
                System.out.println("Have fun with your job!" + "But think about later...");

                break;

            case FRIDAY:
                System.out.println("Happy Friday!");
                break;

            case SATURDAY:
                System.out.println("Just enjoy in the park!");
                break;

            case SUNDAY:
                System.out.println("That's all. Welcome home. See you next week again.");
        }
    }
}
