public class CatFactory implements Factory{
    @Override
    public Animal animalFactory() {
        return new Cat();
    }
}
