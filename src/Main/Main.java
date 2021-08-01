package Main;

import Messenger.Conversations;
import Messenger.Message;
import Messenger.Telegram;
import Messenger.User;

public class Main {
    public static void main(String[] args) {
        try{
            Telegram tg = new Telegram();
            User user = new User("Olga", "+345", "12345");
            Conversations conversation = new Conversations();

            tg.addUser(user);

            tg.addConversation(conversation);

            conversation.addMember(user);

            Message message = new Message(user, "ads");

            conversation.sendMessage(message);

            conversation.getMessages();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
