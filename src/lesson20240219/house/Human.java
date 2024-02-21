package lesson20240219.house;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        animal.feed();
    }

    public void feedAnimal(Animal... animals) {
        for (Animal a : animals) {
            a.feed();
        }
    }


}
