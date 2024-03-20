package lesson20240320.cards;

import lesson20240320.cards.Card;

public class Visa extends Card {

    private int visaId;

    public Visa(int visaId) {
        this.visaId = visaId;
    }

    @Override
    public int getId() {
        return visaId;
    }

    @Override
    public String toString() {
        return "Visa{" +
                "visaId=" + visaId +
                '}';
    }
}
