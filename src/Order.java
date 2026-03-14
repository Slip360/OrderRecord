import java.util.ArrayList;

/**
 * Order class
 */
public class Order {
    /**
     * Order number
     */
    private int orderNumber = 0;

    /**
     * Total
     */
    private float total = 0;

    /**
     * Products list
     */
    private ArrayList<Product> products = new ArrayList<>();

    /**
     * Set order number
     * 
     * @param number Order number
     */
    public void setOrderNumber(int number) {
        this.orderNumber = number;
    }

    /**
     * Get order number
     * 
     * @return Order number
     */
    public int getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * Add product to order
     * 
     * @param product Product to add
     */
    public void addProduct(Product product) {
        this.products.add(product);
        this.total += product.getPrice();
    }

    /**
     * Get products count
     * 
     * @return Products count
     */
    public int getProductsCount() {
        return this.products.size();
    }

    /**
     * Get order as string
     * 
     * @return Order as string
     */
    public String getOrderAsString() {
        String orderAsString = "Pedido No. " + this.orderNumber + "\n";
        for (Product product : this.products) {
            orderAsString += product.productAsString() + "\n";
        }
        orderAsString += "Total: " + this.total + "\n";
        return orderAsString;
    }
}
