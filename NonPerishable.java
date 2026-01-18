public class NonPerishable extends Product {
    
    public NonPerishable() {
    }

    public NonPerishable(String name, float price, String unit, String company, String category) {
        super(name, price, unit, company, category);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
