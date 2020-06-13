package main;
import Shop.shop;

public class Main {

    public static void main(String[] args) {
        shop.NameProd nameProd = new shop.NameProd ("Morning fresh");
        shop comp = new shop ("Бытовая химия", "моющие средства", 05, nameProd);

        shop anon = new shop ("Бытовая техника", "мультиварка", 004, nameProd)
        {
            @Override
            public String toString() {
                return "Товар из анонимного класса:";
            }
        };

        System.out.println (comp);
        System.out.println (anon);
    }
}
