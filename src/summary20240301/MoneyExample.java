package summary20240301;

import lesson20240219.house.Cat;

import java.math.BigDecimal;

public class MoneyExample {

    public static void main(String[] args) {

        double sum = 0.0;

        for (int i = 0; i < 10_000; i++) {
            sum += 0.1;
        }

        System.out.println(sum == 1000.0);
        System.out.println(sum);

        BigDecimal bigDecimalSum = new BigDecimal(0);
        for (int i = 0; i < 10_000; i++) {
            bigDecimalSum = bigDecimalSum.add(BigDecimal.valueOf(0.1));
//            bigDecimalSum = bigDecimalSum.add(new BigDecimal("0.1"));
        }

//        System.out.println(bigDecimalSum.equals(BigDecimal.valueOf(1000)));
        System.out.println(bigDecimalSum.compareTo(BigDecimal.valueOf(1000)));
        System.out.println(bigDecimalSum);

        // 1/3 = 0.3333333333333333333333333
        // 0.1 (10) =  0.0001100110011001100110011 (2)

        // ctrl-c ctrl-v ctrl-x ctrl-a
        String string = "Hello world";
        int k = 1 + 2;

        Cat cat = new Cat("Vasya");


    }


}
