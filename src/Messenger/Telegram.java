package Messenger;

public class Telegram extends BasicMessenger{

    @Override
    public void addUser(User user) {
        System.out.println("Telegram: user " + user.name + " was added!");
    }

    @Override
    public void addConversation(Conversations conversation) {
        System.out.println("Telegram: conversation " + conversation.label + " was added!");
    }

}
