package prspring_example5;
public class SetterDependencyInjection {
    private Dependency dependency;
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString(){
        return dependency.toString();
    }

}
