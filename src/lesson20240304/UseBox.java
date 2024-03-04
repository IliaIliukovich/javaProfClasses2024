package lesson20240304;

public class UseBox {

    public static void main(String[] args) {
        Box box = new Box("toy", 5, true);
        System.out.println(box);
        box.empty();
        System.out.println(box);

        String item = box.getItem();
        System.out.println(item);
        if (item != null) {
            System.out.println(item.toUpperCase());
        } else {
            System.out.println("Item is null. Box is empty");
        }
//        System.out.println(1 / 0);
        System.out.println("do something");


        String someData = getSomeData();
        if (someData != null && someData.length() != 0) {
                System.out.println(someData.charAt(0));
            // process data
        } else {
            // some other logic
        }

        int number = getSomeInt();
        System.out.println(number);

        // shallowCopy example
        Cat cat = new Cat("Tom", "white", 3);
        box = new Box("toy", 5, true, cat);

        System.out.println("After changing name, shallowCopy:");
        Box shallowCopyBox = box.shallowCopy();
        box.getCat().setName("Vasya");
        System.out.println(box);
        System.out.println(shallowCopyBox);

        // deepCopy example
        System.out.println("After changing name, deepCopy:");
        Box deepCopyBox = box.deepCopy();
        box.getCat().setName("Tom");
        System.out.println(box);
        System.out.println(deepCopyBox);

        // cloning example
        try {
            Cat catClone = cat.clone();
            System.out.println("Cloned cat: " + catClone);
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException");
        }

        // deep cloning example
        try {
            System.out.println("After changing name, deep clone:");
            Box boxClone = box.clone();
            box.getCat().setName("New name");
            System.out.println(box);
            System.out.println(boxClone);
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException");
        }

    }


    public static String getSomeData() {
        return "";
    }

    public static int getSomeInt() {
        return 24;
    }


}
