package prspring_example5;

public interface MessageProvider {
    default String getMessage() {
        return null;
    }
}
