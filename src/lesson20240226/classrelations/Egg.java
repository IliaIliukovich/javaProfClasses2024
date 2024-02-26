package lesson20240226.classrelations;

public class Egg {

    private Chicken chicken;

    public Egg() {
//        this.chicken = new Chicken();
    }

    public void setChicken(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public String toString() {
        return "Some egg";
    }
}
