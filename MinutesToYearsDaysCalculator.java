public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hour = minutes / 60;
            long days = hour / 24;
            long years = days / 365;
            long reDays= days%365;
            System.out.println(minutes + "min = " + years + " y " + reDays + " d");
        }



    }
}
