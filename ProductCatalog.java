
import java.io.Serializable;
import java.util.ArrayList;

public class ProductCatalog implements Serializable{
    ArrayList<Product> productList;

    public ProductCatalog() {
        this.productList = new ArrayList<>();
    }

    public ProductCatalog(ArrayList<Product> products) {
        if(products == null){
            this.productList = new ArrayList<>();
        }
        else{
            this.productList = products;
        }
    }

    public void addproduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    
}
