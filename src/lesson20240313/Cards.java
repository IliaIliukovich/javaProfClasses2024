package lesson20240313;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cards {

// Дан список некоторых упорядоченных данных. Необходимо "честно" перемешать данные,
// т.е. распределить их так, чтобы вероятность нахождения любого элемента на любом месте была бы одинакова.
// Например, задача перемешивания колоды карт.

    public static void main(String[] args) {
        List<String> cards = new ArrayList<>(List.of("A", "B", "C", "D", "E"));
//        swap(cards, 0, 4);
//        Collections.shuffle(cards);
        mixCards(cards);
        System.out.println(cards);
    }

    public static void mixCards(List<String> cards) {
        Random random = new Random();
        for (int i = 1; i < cards.size(); i++) {
            swap(cards, i, random.nextInt(i + 1));
        }
    }

    public static void swap(List<String> cards, int i, int j){
        String tmp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, tmp);
    }


}
