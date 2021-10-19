package prspring_example5;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();

}

//public class HelloWorldMessageProvider implements MessageProvider{
//    @Override
//    public String getMessage() {
//        return "hello world";
//    }
//}