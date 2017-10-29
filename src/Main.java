import Transport.CarDoor;

public class Main {
    public static void main(String[] args) {
        new CarDoor("df", "df");
        CarDoor carDoor = new CarDoor();
        carDoor.OpenDoor();
        carDoor.CloseWindow();
        carDoor.OpenOrCloseDoor();
        carDoor.OpenOrCloseWindow();
        carDoor.Show();
    }
}
