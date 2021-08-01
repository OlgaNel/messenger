package Messenger;

public abstract class BasicMessenger {
    String[] users;
    String[] conversations;
    public abstract void addUser(User user);
    public abstract void addConversation(Conversations conversation);
}
