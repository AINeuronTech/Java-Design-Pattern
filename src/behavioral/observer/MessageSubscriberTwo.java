package behavioral.observer;

public class MessageSubscriberTwo implements Observer {

    @Override
    public void update(Message message) {
        System.out.println(message.getMessageContent());
    }
}
