public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        super.doOperation();
        System.out.println("Doing additional operation in ConcreteDecoratorB");
    }
}
