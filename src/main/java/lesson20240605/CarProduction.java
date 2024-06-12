package lesson20240605;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CarProduction {

    // 1 thread ----> CarBody
    // 2 thread ----> Wheel
    // 3 thread ----> 4 Wheel + 1 CarDetail = Car

    private static BlockingQueue<Wheel> wheelQueue = new ArrayBlockingQueue<>(20);
    private static BlockingQueue<CarBody> carBodyQueue = new ArrayBlockingQueue<>(5);
    private static List<Car> cars = new ArrayList<>();

    static class Wheel {
    }

    static class CarBody {
    }

    static class Car {
        List<Wheel> wheels;
        CarBody carBody;
    }

    static class WheelFactory implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Wheel wheel = new Wheel();
                try {
                    wheelQueue.put(wheel);
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
                try {
                    Thread.sleep(25000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                CarBody carBody = new CarBody();
                try {
                    carBodyQueue.put(carBody);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    static class CarFactory implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    CarBody carBody = carBodyQueue.take();
                    List<Wheel> wheels = new ArrayList<>(4);
                    wheels.add(wheelQueue.take());
                    wheels.add(wheelQueue.take());
                    wheels.add(wheelQueue.take());
                    wheels.add(wheelQueue.take());
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Car car = new Car();
                    car.carBody = carBody;
                    car.wheels = wheels;
                    cars.add(car);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new WheelFactory()).start();
//        new Thread(new WheelFactory()).start();
        new Thread(new CarBodyFactory()).start();
//        new Thread(new CarBodyFactory()).start();
        new Thread(new CarFactory()).start();

        while (true) {
            System.out.println("Cars produced: " + cars.size());
            Thread.sleep(1000);
        }
    }


}
