package pattern.decorator.wiki;

public abstract class Decorator implements InterfaceComponent {

    InterfaceComponent interfaceComponent;

    public Decorator(InterfaceComponent interfaceComponent) {
        this.interfaceComponent = interfaceComponent;
    }

    public void doOperation() {

        interfaceComponent.doOperation();
    }

    public void newOperation() {
        System.out.println("Do Nothing");
    }
}
