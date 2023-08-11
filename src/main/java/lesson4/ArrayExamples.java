package lesson4;

import java.util.*;

public class ArrayExamples {
    public void stringsArray() {
        String[] buttons = {"OK", "cancel", "Login", "SignUp"};
        buttons[2] = "Exit";
        int length = buttons.length;

        System.out.println(buttons[2]);
        System.out.println("length" + length);

        for (int i = 0; i < buttons.length; i++) {
            System.out.println(buttons[i]);
        }
        for (String button : buttons) {
            System.out.println(button);
        }
    }
}

//
//        public void stringsArrayWithSize() {
//        String[] array = new String[5];
//        array[0] = "OK";
//        array[1] = "cancel";
//        array[2] = "Login";
//        array[3] = "SignUp";
//        array[4] = "Exit";
//
//        System.out.println("length " + array.length);
//    }
//
//    public void integerArray() {
//        int[] ids = {12, 3, 8, 5};
//        System.out.println(ids[2]);
//    }
//
//    public void arrayListExample() {
//        ArrayList<String> buttons = new ArrayList<String>();
//        buttons.add("OK");
//        buttons.add("cancel");
//        buttons.add("Login");
//        buttons.add("SignUp");
//        buttons.add("Exit");
//
//        for (int i = 0; i < buttons.size(); i++) {
//            System.out.println(buttons.get(i));
//        }
//    }
//
//    {for (String button : buttons) {
//            System.out.println(button);
//        }
//        System.out.println("The size of the list " + buttons.size());
//
//        buttons.add("SignOut");
//        for (String button : buttons) {
//            System.out.println(button);
//        }
//
//        buttons.remove("Exit");
//        for (String button : buttons) {
//            System.out.println(button);
//        }
//
//        buttons.clear();
//        System.out.println(buttons.size());
//    }
//
//    public void arrayListSortingExample() {
//
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(123);
//        arrayList.add(3);
//        arrayList.add(23);
//        arrayList.add(98);
//
//        Collections.sort(arrayList);
//        for(Integer i: arrayList){
//            System.out.println(i);
//        }
//
//    }
//  public void hashMapExample(){
//
//      HashMap<String,String> hashMap = new HashMap<String,String>();
//      hashMap.put("John","Toronto");
//      hashMap.put("Kate","Almaty");
//      hashMap.put("Bill","Moscow");
//
//      System.out.println(hashMap);
//
//      System.out.println(hashMap.get("Bill")); //--where Bill lives
//
//      hashMap.remove("John");  //--removes from the list
//
//      System.out.println(hashMap.size()); //--gives us size/number
//
//       }
//       public void hashSetExample(){
//           HashSet<String> hashSet = new HashSet<String>();
//           hashSet.add("John");
//           hashSet.add("Kate");
//           hashSet.add("Bill");
//           System.out.println(hashSet);
//
//           List<String> list = new ArrayList<String>(hashSet);
//           Collections.sort(list);
//           System.out.println(list);
//       }
//}
