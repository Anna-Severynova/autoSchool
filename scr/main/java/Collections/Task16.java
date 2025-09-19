//package Collections;
//
//import java.util.*;
//
//public class Task16 {
//    public static void main(String[] args) {
//
//        Map<String, String> map = new HashMap<>();
//
//        map.put("Osipenko", "Maksim");
//        map.put("Potapova", "Olena"); // should be deleted
//        map.put("Shubina", "Ekaterina");
//        map.put("Tavridow", "Pavel");
//        map.put("Klimenko", "Olexander");
//        map.put("Fedorovq", "Fedor");
//        map.put("Fedorov", "Petro"); // should be deleted
//        map.put("Petrov", "Petro"); // should be deleted
//        map.put("Vasilenkoq", "Olena"); // should be deleted
//        map.put("Vasilenko", "Anastasiya");
//
//        String [] arr = map.values().toArray(new String[0]);
//        for (int i = 0; i < arr.length; i++){
//            for(int j = i+1; j< arr.length; j ++){
//                if(arr[i].equals(arr[j])){
//                    map.remove(arr[i]);
//                    map.
//                }
//            }
//        }
//        System.out.println(map);
//
//    }
//}