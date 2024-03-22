package summary20240322;

import java.util.*;

public class Examples {

    public static void main(String[] args) {
        List<String> lines = new LinkedList<>(Arrays.asList("A", "One", "A", "Two", "Three", "Four", "A"));

//        for(String s: lines){
//            if(s.length() <= 3){
////                lines.remove("Two");
////                lines.add("X");
//            }
//        }
//        System.out.println(lines);
//
//        int index = -1;
//        for(String s: lines){
//            if(s == "A"){
//                index = lines.indexOf("A");
//            }
//        }
//        lines.remove(index);
//        System.out.println(lines);

        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.equals("A")) iterator.remove();
        }
        System.out.println(lines);




    }


}
