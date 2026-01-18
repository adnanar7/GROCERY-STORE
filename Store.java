
import java.io.Serializable;
import java.util.ArrayList;

public class Store implements Serializable{
    String name;
    String location;
    Manager manager;
    ArrayList<InventoryItem> inventoryItem;

    public Store() {
    }

    public Store(String name, String location, Manager manager, ArrayList<InventoryItem> inventoryItem) {
        this.name = name;
        this.location = location;
        this.manager = manager;
        if(inventoryItem == null){
            this.inventoryItem = new ArrayList<>();
        }
        else{
            this.inventoryItem = inventoryItem;
        }
    }

    public void set_StoreName(String name) {
        this.name = name;
    }

    public void set_StoreLocation(String location) {
        this.location = location;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public void setInventoryItem(ArrayList<InventoryItem> inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public String get_StoreName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public Manager getManager() {
        return manager;
    }
    public ArrayList<InventoryItem> getInventoryItem() {
        return inventoryItem;
    }


    @Override
    public String toString(){
        return 
        "Store Name : " + get_StoreName() +
        "Store Location " + getLocation() +
        "Manager Details : " +  manager.toString() + 
        "Inventory Details" + inventoryItem.toString() ;
        

    }

}
