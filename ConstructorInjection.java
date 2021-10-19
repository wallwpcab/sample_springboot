package prspring_example5;

public class ConstructorInjection {
    private Dependency dependency;
    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }
    @Override
    public String toString() {
        return dependency.toString();
    }
}
