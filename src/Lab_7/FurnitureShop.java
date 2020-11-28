package Lab_7;

public class FurnitureShop {

    protected Bed bed1;
    protected Bed bed2;
    protected Cupboard cupboard1;
    protected Cupboard cupboard2;
    protected Sofa sofa1;
    protected Sofa sofa2;

    public FurnitureShop () {
        bed1 = new Bed ("White", 19990, 1);
        bed2 = new Bed ("Blue", 17990, 0.8);
        cupboard1 = new Cupboard("Brown", 14990, 0.9);
        cupboard2 = new Cupboard("Black", 16990, 0.9);
        sofa1 = new Sofa("Purple", 24990, 1);
        sofa2 = new Sofa("Milky", 23990, 0.7);
    }

    public void setValue (Furniture furniture, double newValue) {
        furniture.setValue(newValue);
    }

    public void setDiscount (Furniture furniture, double newDiscount) {
        furniture.setDiscount(newDiscount);
    }

    @Override
    public String toString() {
        return "Price list :" + "\n" + bed1.toString() + "\n" + bed2.toString() + "\n" + cupboard1.toString() +
                "\n" +cupboard2.toString() + "\n" + sofa1.toString() + "\n" + sofa2.toString();
    }
}
