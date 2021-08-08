package Messenger;

import java.util.List;

public abstract class BasicMessenger {
    List<String> users;
    List <String> conversations;
    public abstract void addUser(User user);
    public abstract void addConversation(Conversations conversation);
}
