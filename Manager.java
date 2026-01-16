public class Manager extends User {
    private String storeLocation;

    public Manager() {
    }

    public Manager(String storeLocation, String name, String gender, String phone_number, String address, String user_name, String password) {
        super(name, gender, phone_number, address, user_name, password);
        this.storeLocation = storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    @Override
    public String toString(){
        return 
        "Name : " + getName() + "\n" +
        "Gender : " + getGender() + "\n" +
        "Adress : " + getAddress() + "\n" +
        "Phone Number : " + getPhone_number() + "\n" +
        " Store Location : " + getStoreLocation()+ "\n" ;
    }
}
