package lesson20240304;

public class Box implements Cloneable {

    private String item;

    private int count;

    private boolean canBeSold;

    private Cat cat;


    public Box(String item, int count, boolean canBeSold) {
        this.item = item;
        this.count = count;
        this.canBeSold = canBeSold;
    }

    public Box(String item, int count, boolean canBeSold, Cat cat) {
        this.item = item;
        this.count = count;
        this.canBeSold = canBeSold;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item='" + item + '\'' +
                ", count=" + count +
                ", canBeSold=" + canBeSold +
                ", cat=" + cat +
                '}';
    }

    public void empty() {
        item = null;
        count = 0;
        canBeSold = false;
    }

    public Box shallowCopy() {
        return new Box(item, count, canBeSold, cat);
    }

    public Box deepCopy() {
        Cat newCat = new Cat(cat.getName(), cat.getColour(), cat.getAge());
        return new Box(item, count, canBeSold, newCat);
    }

    @Override
    public Box clone() throws CloneNotSupportedException {
        Box cloned = (Box) super.clone();
        cloned.cat = cat.clone();
        return cloned;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
