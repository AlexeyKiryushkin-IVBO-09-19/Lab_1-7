package Lab_7;

public class Testing {

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        shop.setValue(shop.bed1, 20990);
        shop.setDiscount(shop.bed2, 0.5);
        shop.setValue(shop.cupboard2, 18990);
        shop.setDiscount(shop.cupboard2, 1);
        shop.setDiscount(shop.sofa2, 0.9);
        System.out.println(shop.toString());
    }
}
