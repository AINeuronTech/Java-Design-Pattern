package behavioral.observer;

public class ShowObserverPattern {
    public static void main(String[] args) {
        MessageSubscriberOne jon = new MessageSubscriberOne();
        MessageSubscriberTwo bob = new MessageSubscriberTwo();
        MessageSubscriberThree kelly = new MessageSubscriberThree();

        MessagePublisher publisher = new MessagePublisher();
        publisher.attach(kelly);
        publisher.attach(bob);
        publisher.attach(jon);

        publisher.notifyUpdate(new Message("Bitcoin is rising"));

        publisher.detach(kelly);
        publisher.detach(bob);

        publisher.notifyUpdate(new Message("Ethereum is designing virtual computer"));

    }
}
