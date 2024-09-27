package JavaKeywords;
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.SUNDAY;

        switch (today) {
            case SUNDAY:
                System.out.println("Relax, it's Sunday!");
                break;
            case MONDAY:
                System.out.println("Start of the work week.");
                break;
            case FRIDAY:
                System.out.println("It's Friday! Almost weekend.");
                break;
            default:
                System.out.println("It's a regular day.");
        }
    }
}

