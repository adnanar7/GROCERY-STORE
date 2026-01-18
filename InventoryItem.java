
import java.io.Serializable;

public class InventoryItem implements Serializable {
    private Product product;
    private int quantity;

    public InventoryItem() {
    }

    public InventoryItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }


    public String getStatus(){
        if(this.quantity == 0){
            return "Not Available";
        }
        else{
            return "Available";
        }
    }

    @Override
    public String toString(){
        return 
        product.toString() +
        "Product Quantity"   + getQuantity() + "\n" +
        "Product Status :" + getStatus() ;
    }
}
