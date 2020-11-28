package Lab_7;

public class Bed extends Furniture {

    public Bed (String color, double value, double discount) {
        this.color = color;
        this.value = value;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return color + " bed......................................................" + getCost();
    }
}
