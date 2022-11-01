package Lesson6;

import java.lang.reflect.Type;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {
        Trees oak = new Trees();
        Trees maple = new Trees();


        oak.setColor("green"); oak.setHeight(35); oak.setType("deciduous tree"); oak.setTime_blooming("Spring");
        oak.characteristics();
        maple.setColor("red"); maple.setHeight(25); maple.setType("deciduous tree"); maple.setTime_blooming("Spring");
        maple.characteristics();
        System.out.println(oak.toString());
        System.out.println(maple.toString());
        System.out.println(oak.equals(maple));
    }
}