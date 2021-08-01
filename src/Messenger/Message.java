package Messenger;

public class Message {
    String messageId;
    User sender;
    String messageText;

    public Message( User sender, String messageText) {
        this.sender = sender;
        this.messageText = messageText;
    }
}
