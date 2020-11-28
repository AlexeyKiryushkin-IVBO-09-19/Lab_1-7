package Lab_7;

public class Cupboard extends Furniture {

    public Cupboard (String color, double value, double discount) {
        this.color = color;
        this.value = value;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return color + " cupboard................................................" + getCost();
    }
}
