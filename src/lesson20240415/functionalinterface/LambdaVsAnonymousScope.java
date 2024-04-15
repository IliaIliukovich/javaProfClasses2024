package lesson20240415.functionalinterface;

import lesson20240313.anonymousclass.Playable;

import java.util.function.Consumer;

public class LambdaVsAnonymousScope {

    public static void main(String[] args) {

        String data = "Main Data";
        int counter = 0; // must be effectively final
//        counter++;

        Playable footballPlayer = new Playable() {
            String data = "Anonymous Data"; // shadowing

            @Override
            public void play() {
//                String data = "Anonymous Data"; // shadowing
                System.out.println(data);
                System.out.println(counter);
            }
        };

        footballPlayer.play();

        Playable chessPlayer = () -> {
//          String data = "Lambda Data"; // impossible
          System.out.println(data);
          System.out.println(counter);
        };

        chessPlayer.play();

        Consumer<Integer> consumer = (integer) -> {
            if (integer % 2 == 0) {
                System.out.println(integer);
            } else {
                System.err.println(integer);
            }
        };

        consumer.accept(2);
        consumer.accept(3);
        consumer.accept(4);
        consumer.accept(5);
    }


}
