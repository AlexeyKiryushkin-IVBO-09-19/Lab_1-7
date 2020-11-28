package Lab_7;

public class Sofa extends Furniture {

    public Sofa (String color, double value, double discount) {
        this.color = color;
        this.value = value;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return color + " sofa...................................................." + getCost();
    }
}
