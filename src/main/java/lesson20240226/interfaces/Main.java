package lesson20240226.interfaces;

public class Main {

    public static void main(String[] args) {
        Flyable sparrow = new Sparrow();
        Flyable plane = new Plane();

        plane.fly();
        sparrow.fly();

        Chirikable chirikable = new Sparrow();
        chirikable.chirik();
        chirikable.makeSomeSound();

        makeEntitiesFly(plane, sparrow);
    }

    public static void makeEntitiesFly(Flyable... flyables) {
        for (Flyable f : flyables) {
            f.fly();
        }
    }



}
