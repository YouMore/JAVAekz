public class RussianFactory implements CountryFactory{
    @Override
    public Car createCar(){
        return new RussianCar();
    }

    @Override
    public Food createFood(){
        return new RussianFood();
    }
}
