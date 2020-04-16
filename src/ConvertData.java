import java.util.Scanner;

public class ConvertData {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        String userDate, fullDate;
        String month, days, year;
        char month1, month2, day1, day2, year1, year2, year3, year4;

        System.out.print("Enter today's Date in this format (mm/dd/yyyy): ");
        userDate = in.nextLine();
        while (userDate.length() != 10){
            System.out.println("Error! Wrong response, follow the date format.");
            System.out.print("Enter today's Date in this format (mm/dd/yyy): ");
            userDate = in.nextLine();
        }
        month1 = userDate.charAt(0);
        month2 = userDate.charAt(1);
        day1 = userDate.charAt(3);
        day2 = userDate.charAt(4);
        year1 = userDate.charAt(6);
        year2 = userDate.charAt(7);
        year3 = userDate.charAt(8);
        year4 = userDate.charAt(9);

        month = Character.toString(month1) + Character.toString(month2);
        days = Character.toString(day1) + Character.toString(day2);
        year = Character.toString(year1) + Character.toString(year2) +
               Character.toString(year3) + Character.toString(year4);

        int newMonth = Integer.parseInt(month);
        int newDays = Integer.parseInt(days);
        int newYear = Integer.parseInt(year);

        if (newMonth > 12 || newMonth < 1)
            System.out.println("Invalid date entered.");
        else if (newDays < 1 || newDays > 31)
            System.out.println("Invalid date entered. Wrong day " +
                    "number: " + newDays);
        else if (newMonth == 2 && newDays > 29)
            System.out.println("Invalid date entered. February " +
                    "month don't have " + newDays + " days");
        else if ((newMonth == 4 || newMonth == 6 || newMonth == 9
                || newMonth == 11) && (newDays > 30))
            System.out.println("Invalid date entered. The month entered don't " +
                    "have " + newDays + " days.");
        else {
            switch (newMonth){
                case 1:
                    System.out.println("It is January " + newDays + ", " + newYear);
                    break;
                case 2:
                    System.out.println("It is February " + newDays + ", " + newYear);
                    break;
                case 3:
                    System.out.println("It is March " + newDays + ", " + newYear);
                    break;
                case 4:
                    System.out.println("It is April " + newDays + ", " + newYear);
                    break;
                case 5:
                    System.out.println("It is May " + newDays + ", " + newYear);
                    break;
                case 6:
                    System.out.println("It is June " + newDays + ", " + newYear);
                    break;
                case 7:
                    System.out.println("It is July " + newDays + ", " + newYear);
                    break;
                case 8:
                    System.out.println("It is August " + newDays + ", " + newYear);
                    break;
                case 9:
                    System.out.println("It is September " + newDays + ", " + newYear);
                    break;
                case 10:
                    System.out.println("It is October " + newDays + ", " + newYear);
                    break;
                case 11:
                    System.out.println("It is November " + newDays + ", " + newYear);
                    break;
                default:
                    System.out.println("It is December " + newDays + ", " + newYear);

            }
        }

    }
}
