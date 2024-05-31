package lesson20240529;

import java.util.Random;

public class RunnersTask {

    // Спортивное соревнование. Бегут 3 бегуна. Каждый пробегает дистанцию за случайное время.
    // Каждый бегун земеряет свой результат и сообщает его тренеру. В конце забега выводится информация о победителе.
    // Реализовать данную модель с помощью запуска отдельных потоков. Бегуна представить через класс Runner implements Runnable.

    public static void main(String[] args) {
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();
        Runner runner3 = new Runner();
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        Thread thread3 = new Thread(runner3);
        thread1.start();
        thread2.start();
        thread3.start();


        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner1.getResult());
        System.out.println(runner2.getResult());
        System.out.println(runner3.getResult());
    }
    static class Runner implements Runnable{
        long result;

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            System.out.println("Start"+Thread.currentThread().getName());
            try {
                Random random = new Random();
                Thread.sleep(10_000+random.nextInt(10_000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            crossBridge();
            System.out.println("End"+Thread.currentThread().getName());
            long end = System.currentTimeMillis();
            setResult(end-start);
        }

        public long getResult() {
            return result;
        }

        public void setResult(long result) {
            this.result = result;
        }
    }
}