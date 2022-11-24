package Lesson9;

import java.time.YearMonth;
import java.util.Scanner;

public class TaskString2 {

    public static void main(String[] args) {

        //Initial data
        String[] months = new String[]{"январь", "февраль", "март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь"};
        String[] monthsId = new String[]{"1", "2", "3","4","5","6","7","8","9","10","11","12"};

        //Enter input data
        Scanner in = new Scanner(System.in);
        System.out.println("Enter day");
        int day = in.nextInt();
        System.out.println("Enter month");
        String monthsInput = in.next();
        System.out.println("Enter year");
        int year = in.nextInt();


        //get month name
        int monthIndx = 0;
        for (int i = 0; i < monthsId.length; i++) {
            if (months[i].equalsIgnoreCase(monthsInput)) {
                monthIndx = Integer.parseInt(monthsId[i]);
                break;
            }
        }

        //check data validity
        YearMonth yearMonthObject = YearMonth.of(year, Integer.parseInt(monthsInput));
        int daysInMonth = yearMonthObject.lengthOfMonth();

        if ((year > 0)
                && (day > 0)
                && (day <= daysInMonth)
                && (monthIndx > 0)
                && (monthIndx <= 12)){
            System.out.println(day+" "+monthIndx +" "+year);
        }
        else {
            System.out.println("Invalid input");
        }

    }
}

