import Transport.Car;
import Transport.CarDoor;
import Transport.CarWheel;

public class Main {
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        carDoor.OpenDoor();
        carDoor.CloseWindow();
        carDoor.Show();
        carDoor.OpenOrCloseDoor();
        carDoor.OpenOrCloseWindow();


        CarWheel carWheel = new CarWheel();
        carWheel.NewWheel();
        carWheel.ClearTheTire(20);


        Car car = new Car();
        car.ChangeCurrentSpeed(100);
        car.AddPassenger();
        car.DelPassenger();
        car.DelAllPassenger();
        //car.getWheelByIndex();
        //car.getDoorByIndex();
        car.dellAllWheels();
        car.addSomeWheels(3);
        car.maxSpeed((float) 0.8);
        car.AddPassenger();
        car.maxSpeed((float) 0.9);
    }
}
