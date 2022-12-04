package Lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone(1050, "Samsung Galaxy S21"));
        phones.add(new Phone(1100, "Apple iPhone 12"));
        phones.add(new Phone(625, "Xiaomi Redmi Note 11 Pro"));
        System.out.println("Choice the season, where: 1 - winter, 2 - spring, 3 - summer, 4 - autumn");


        String season = " ";
        Scanner in = new Scanner(System.in);
        int choice;
        choice = in.nextInt();


        switch (choice) {
            case 1: {
                season = "winter";
                break;
            }
            case 2: {
                season = "spring";
                break;
            }
            case 3: {
                season = "summer";
                break;
            }
            case 4: {
                season = "autumn";
                break;
            }
            default:
                season = "spring";

        }
        phones.stream().sorted(new PhoneComparator()).forEach(p -> System.out.println("Price without discount : " + p.getName() + " - " + p.getPrice()));

        System.out.println("");
        if(season == "spring" || season == "autumn")
            System.out.println("начились плохие времена поэтому и цена такая ");
        String finalSeason = season;
        phones.stream().sorted(new PhoneComparator()).forEach(p -> System.out.println("Price with discount in " + finalSeason + " : " + p.getName() + " - " + String.format("%.3f", p.chooseAndGetSeasonPrice(finalSeason))));
    }

    static class PhoneComparator implements Comparator<Phone> {

        @Override
        public int compare(Phone a, Phone b) {
            if (a.getPrice() > b.getPrice()) {
                return 1;
            } else if (a.getPrice() == b.getPrice()) {
                return 0;
            } else {
                return -1;
            }
        }

    }
}