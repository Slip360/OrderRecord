/**
 * Product class
 */
public class Product {

    /**
     * Product name
     */
    private String name;

    /**
     * Product price
     */
    private float price;

    /**
     * Product code
     */
    private String code;

    /**
     * Product constructor
     * 
     * @param name  Product name
     * @param price Product price
     * @param code  Product code
     */
    public Product(String name, float price, String code) {
        this.name = name;
        this.price = price;
        this.code = code;
    }

    /**
     * Get product name
     * 
     * @return Product name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get product price
     * 
     * @return Product price
     */
    public float getPrice() {
        return this.price;
    }

    /**
     * Get product code
     * 
     * @return Product code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Method to return product as string
     * 
     * @return Product as string
     */
    public String productAsString() {
        return "Producto: " + this.name + "\n" + "Precio: " + this.price + "\n" + "Codigo: " + this.code;
    }

}
