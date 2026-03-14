import java.util.List;

/**
 * Menu class
 */
public class Menu {

    /**
     * List of products in the menu
     */
    public static final List<Product> PRODUCTS = List.of(
            new Product("Espresso", 2.50f, "C01"),
            new Product("Cappuccino", 3.75f, "C02"),
            new Product("Latte Macchiato", 4.25f, "C03"),
            new Product("Americano", 2.80f, "C04"),
            new Product("Chocolate Caliente", 3.50f, "C05"),
            new Product("Iced Caramel Latte", 4.95f, "F01"),
            new Product("Frappuccino de Vainilla", 5.20f, "F02"),
            new Product("Muffin de Arándanos", 2.75f, "P01"),
            new Product("Croissant de Mantequilla", 2.25f, "P02"),
            new Product("Cookie con Chispas de Chocolate", 1.80f, "P03"));

}
