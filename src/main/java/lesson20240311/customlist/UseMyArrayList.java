package lesson20240311.customlist;

import lesson20240311.customlist.MyArrayList;

import java.util.Iterator;

public class UseMyArrayList {

    public static void main(String[] args) {
        String[] data = new String[] {"A", "B", "C", "D", "E"};

        MyArrayList myList = new MyArrayList(data);
        System.out.println(myList);

        for (String s : myList) {
            // some actions
            System.out.println(s);
        }

        Iterator<String> iterator = myList.reverseIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        List<String> list = new ArrayList<>();
//        list.iterator();
//        list.listIterator();
    }


}
