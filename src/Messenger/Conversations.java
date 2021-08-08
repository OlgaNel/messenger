package Messenger;

import java.util.ArrayList;
import java.util.List;

public class Conversations {
    List <Message> messages = new ArrayList();
    String label;
    List <User> members;

    public void addMember(User user){
        System.out.println("Conversations: user " + user.name + " was added to " + this.label);
    }
    public void sendMessage(Message message){
        System.out.println("The message: " + message.messageText + " has been sent");
        messages.add(message);
    }
    public void getMessages(){
        System.out.println("All messages from converstion:");
        for (int i = 0; i < messages.size(); i++) {
            System.out.println(messages.get(i).messageText + " from " + messages.get(i).sender.name);
        }
    }
}
