package lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class M5Assignment {
    public static void main(String[] args) {
        getDay(1);
//        Scanner scanner = new Scanner((System.in));
//        System.out.println("Enter the Toy ID:");
//        int id = Integer.parseInt(scanner.next());
        //getToyById(12);
    }

    public static void getDay(int a) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (a <= 1 || a >= 7) {
            System.out.println("Wrong day");
        } else {
            System.out.println(weekdays[2]);
        }
    }


    public static void getToyById(int a) {
        HashMap<Integer, String> getToyById = new HashMap<Integer, String>();
        getToyById.put(12, "Batmobile");
        getToyById.put(45, "Light Saber");
        getToyById.put(6, "Wonder Woman");
        getToyById.put(201, "Hello Kitty Bag");
        getToyById.put(56, "Junior QA Analyst Doll");
        //System.out.println(getToyById);
        System.out.println(getToyById.get(a));
//
//            if (getToyById(a) == null) ;
//            {
//                System.out.println("No such Toy");
//            }else{
//                System.out.println(getToyById.get(a));
//            }
//        }
//    public static void hashSetAssignment(){
//        HashSet<String> hashSet = new HashSet<=>();
//        hashSet.add("Steve");
//        hashSet.add("Tim");
//        hashSet.add("Lucy");
//        hashSet.add("Steve");
//        hashSet.add("Pat");
//        hashSet.add("Angela");
//        hashSet.add("Tom");
//        hashSet.add("Tim");
//        hashSet.add("Anna");
//        hashSet.add("Lucy");
//        List<String> List = new ArrayList<=>(hashSet);
//
//        System.out.println(hashSet);
//        Collections.sort(List);
//        System.out.println(List);
//    }
    }
}





