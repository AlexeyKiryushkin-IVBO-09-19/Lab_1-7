package Lab_7;

public abstract class Furniture {

    protected String color;
    protected double value;
    protected double discount;

    public Furniture () {};

    public Furniture (String color, double value, double discount) {
        this.color = color;
        this.value = value;
        this.discount = discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getCost() {
        double cost = value * discount;
        return cost;
    }

    public abstract String toString();
}
