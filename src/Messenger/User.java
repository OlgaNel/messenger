package Messenger;

public class User {
    String name;
    String phone;
    String password;
    String userId;
    User[] contact;
    public void addContact(){
        System.out.println();
    }

    public User(String name, String phone, String password) {
        this.name = name;
        this.phone = phone;
        this.password = password;
    }
}
