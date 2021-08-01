package Messenger;

public class Conversations {
    Message[] messages = new Message[50];
    Integer lastMessageIndex = 0;
    String label;
    User[] members;

    public void addMember(User user){
        System.out.println("Conversations: user " + user.name + " was added to " + this.label);
    }
    public void sendMessage(Message message){
        System.out.println("The message: " + message.messageText + " has been sent");
        messages[lastMessageIndex] = message;
        lastMessageIndex++;
    }
    public void getMessages(){
        System.out.println("All messages from converstion:");
        for (int i = 0; i < lastMessageIndex; i++) {
            System.out.println(messages[i].messageText + " from " + messages[i].sender.name);
        }
    }
}
