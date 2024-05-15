package lesson20240313.nestedclass;

import static lesson20240313.nestedclass.Dog.DogFood;
public class Dogs {

    public static void main(String[] args) {
        Dog dog = new Dog("Jack");

//        Dog.DogFood dogFood = new Dog.DogFood("bone");
        DogFood dogFood = new DogFood("bone");
        DogFood dogFood2 = new DogFood("meat");

        dog.setDogFood(dogFood);
        System.out.println(dog);
    }


}
