import java.util.ArrayList;
import java.util.Scanner;

public class App {

    /**
     * Orders list
     */
    private static ArrayList<Order> orders = new ArrayList<>();

    /**
     * Show menu
     */
    private static void showMenu() {
        int productNumber = 1;
        for (Product product : Menu.PRODUCTS) {
            System.out.println("-------------------------------- Producto No. " + productNumber++
                    + " --------------------------------");
            System.out.println(product.productAsString());
            System.out.println("--------------------------------");
        }
    }

    /**
     * Show options
     */
    private static void showOptions() {
        System.out.println("--------------------------------");
        System.out.println("1. Crear pedido");
        System.out.println("2. Ver pedidos");
        System.out.println("3. Salir");
        System.out.println("--------------------------------");
    }

    /**
     * Get selected option
     * 
     * @param scanner Scanner object
     * @return Selected option
     */
    private static int getSelectedOption(Scanner scanner) {
        System.out.print("Seleccione una opción: ");
        int selectedOption = scanner.nextInt();
        return selectedOption;
    }

    /**
     * Clear console
     */
    private static void clear() {
        System.out.flush();
    }

    /**
     * Create order
     * 
     * @param scanner Scanner object
     */
    private static void createOrder(Scanner scanner) {
        System.out.println("-------------------------------- Pedido No." + (orders.size() + 1)
                + " --------------------------------");
        Order order = new Order();
        order.setOrderNumber(orders.size() + 1);
        showMenu();
        int selectedOption = -1;
        while (selectedOption != 0) {
            System.out.println("Ingrese 0 para terminar la orden.");
            selectedOption = getSelectedOption(scanner);
            if (selectedOption >= 1 && selectedOption <= Menu.PRODUCTS.size()) {
                order.addProduct(Menu.PRODUCTS.get(selectedOption - 1));
            }
        }
        orders.add(order);
    }

    /**
     * Show orders
     */
    private static void showOrders() {
        System.out.println("-------------------------------- Pedidos --------------------------------");
        for (Order order : orders) {
            System.out.println(order.getOrderAsString());
        }
    }

    public static void main(String[] args) throws Exception {
        int selectedOption = 0;
        Scanner scanner = new Scanner(System.in);
        while (selectedOption != 3) {
            showOptions();
            selectedOption = getSelectedOption(scanner);
            clear();
            if (selectedOption == 1) {
                createOrder(scanner);
            } else if (selectedOption == 2) {
                showOrders();
            }
        }
        scanner.close();
    }
}
