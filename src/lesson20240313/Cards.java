package lesson20240313;

import java.util.ArrayList;
import java.util.List;

public class Cards {

// Дан список некоторых упорядоченных данных. Необходимо "честно" перемешать данные,
// т.е. распределить их так, чтобы вероятность нахождения любого элемента на любом месте была бы одинакова.
// Например, задача перемешивания колоды карт.

    public static void main(String[] args) {
        List<String> cards = new ArrayList<>(List.of("A", "B", "C", "D", "E"));
        swap(cards, 0, 4);
//        mixCards(cards);
        System.out.println(cards);
    }

    public static void mixCards(List<String> cards) {

    }

    public static void swap(List<String> cards, int i, int j){
        String tmp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, tmp);
    }


}
