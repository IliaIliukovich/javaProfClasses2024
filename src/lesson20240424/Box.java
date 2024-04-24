package lesson20240424;

public class Box<Item> {

    private Item item;

    public void put(Item item) {
        this.item = item;
    }

    public Item get() {
        if (item == null) throw new RuntimeException("No item in the box");
        return this.item;
    }

    public Item remove() {
        Item tmp = item;
        item = null;
        return tmp;
    }

}
