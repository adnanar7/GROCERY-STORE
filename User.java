
import java.io.Serializable;

abstract class User implements Serializable{
    private String name;
    private String gender;
    private String phone_number;
    private String address;
    private String user_name;
    private String password;

    public User() {
    }

    public User(String name, String gender, String phone_number, String address, String user_name, String password) {
        this.name = name;
        this.gender = gender;
        this.phone_number = phone_number;
        this.address = address;
        this.user_name = user_name;
        this.password = password;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Getters

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public String getAddress() {
        return address;
    }
    public String getUser_name() {
        return user_name;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public String toString(){
        return 

        "Name : " + name + "\n" +
        "Gender : " + gender + "\n" +
        "Adress : " + address + "\n" +
        "Phone Number : " + phone_number;
     }
}