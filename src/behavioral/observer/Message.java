package behavioral.observer;

public class Message {
    String messageContent;

    public Message(String message){
        this.messageContent = message;
    }
    public String getMessageContent(){
        return messageContent;
    }
}
