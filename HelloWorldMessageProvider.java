package prspring_example5;

public class HelloWorldMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "hello world";
    }
}
