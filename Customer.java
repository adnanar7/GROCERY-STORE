
public class Customer extends User {
    private String cnic;

    public Customer() {
    }

    public Customer(String cnic, String name, String gender, String phone_number, String address, String user_name, String password) {
        super(name, gender, phone_number, address, user_name, password);
        this.cnic = cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getCnic() {
        return cnic;
    }

    @Override
    public String toString(){
        return 
        super.toString() +
        "CNIC :" + getCnic() ;
    }
}
