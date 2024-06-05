package lesson20240605;

import java.util.List;

public class CarProduction {

    // 1 thread ----> CarBody
    // 2 thread ----> Wheel
    // 3 thread ----> 4 Wheel + 1 CarDetail = Car

    static class Wheel {
    }

    static class CarBody {
    }

    static class Car {
        List<Wheel> wheels;
        CarBody carDetail;
    }

    static class WheelFactory implements Runnable {
        @Override
        public void run() {
            while (true) {
                Wheel wheel = new Wheel();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    static class CarBodyFactory implements Runnable {
        @Override
        public void run() {
            while (true) {
                CarBody carBody = new CarBody();
                try {
                    Thread.sleep(25000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) {
        new Thread(new WheelFactory()).start();
        new Thread(new CarBodyFactory()).start();
    }


}
