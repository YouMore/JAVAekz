public class CarFacade {
    public void getReadyCar(){
        Lock.unlock();
        Engine.start();
        ClimateControl.on();
    }
    public void turnOffCar(){
        ClimateControl.off();
        Engine.stop();
        Lock.lock();
    }
}
