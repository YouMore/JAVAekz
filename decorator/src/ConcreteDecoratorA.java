public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        super.doOperation();
        System.out.println("Doing additional operation in ConcreteDecoratorA");
    }
}
