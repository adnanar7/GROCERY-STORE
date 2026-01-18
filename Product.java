public abstract class Product implements Serializable {
    private String name;
    private float price;
    private String unit;
    private String company;
    private String category;

    public Product() {
    }

    public Product(String name, float price, String unit, String company, String category) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.company = company;
        this.category = category;
    }

    public void set_ProductName(String name){
        this.name = name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setCategory(String Category){
        this.category = category;
    }

    public String get_ProductName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public String getCompany() {
        return company;
    }
    public String getUnit() {
        return unit;
    }

    @Override
    public String toString(){
        return 
        "Product Name : " + get_ProductName() + "\n" +
        "Product Price : " + getPrice() + "\n" +
        "Product Category : " + getCategory() + "\n" +
        "Product Company : " + getCompany() + "\n" +
        "Product Units :"    + getUnit() ;


    }

}

