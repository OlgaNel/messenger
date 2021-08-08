package Messenger;

import java.util.List;

public class User {
    String name;
    String phone;
    String password;
    String userId;
    List<User> contact;
    public void addContact(){
        System.out.println();
    }

    public User(String name, String phone, String password) {
        this.name = name;
        this.phone = phone;
        this.password = password;
    }
}
