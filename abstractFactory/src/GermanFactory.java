public class GermanFactory implements CountryFactory{
    @Override
    public Car createCar(){
        return new GermanCar();
    }
    @Override
    public Food createFood(){
        return new GermanFood();
    }
}