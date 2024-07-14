package Homework6F20;
import java.util.UUID;

public class Product {
    private static UUID INV_NUMBER;
    private String invDescription;

    public static enum Category{
        A,
        B,
        C,
        D
    }
    private Category category;
    private double price;

    public static UUID getInvNumber() {
        return INV_NUMBER;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public String getInvDescription() {
        return invDescription;
    }

    public void setInvDescription(String invDescription) {
        if(invDescription != null) {
            this.invDescription = invDescription;
        }else{
            this.invDescription="";
        }
    }

    public Product() {
    }

    public Product(String invDescription, double price, Category category) {
        setInvDescription(invDescription);
        this.price = price;
        this.category=category;
        INV_NUMBER= UUID.randomUUID();
    }

    public Product(Product product) {
        this.invDescription = product.invDescription;
        this.price = product.price;
        this.category=product.category;
    }

    @Override
    public String toString() {
        return "invDescription='" + invDescription + ", price=" + price +
                ", INV_NUMBER=" + INV_NUMBER +", categoty="+category+ "\n";
    }
}
