package lesson20240226.interfaces;

public class Plane extends Item implements Flyable{

    @Override
    public void fly(){
        System.out.println("Plane flies");
    }
}
