package lesson20240311.innerclass;

import lesson20240311.innerclass.Cat;

public class CatHouse {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Cat.Kitten kitten1 = cat.new Kitten("Kitten 1");
        Cat.Kitten kitten2 = cat.new Kitten("Kitten 2");

        System.out.println(kitten1);
        System.out.println(kitten2);

        Cat cat2 = new Cat("Cat2");
        Cat.Kitten kitten3 = cat2.new Kitten("Kitten 3");
        System.out.println(kitten3);

    }


}
