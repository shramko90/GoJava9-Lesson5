package Transport;

public class CarDoor {
    private String window;
    private String door;

    public CarDoor() {
    }

    public CarDoor(String window, String door) {
        this.window = window;
        this.door = door;
    }

    public void OpenDoor(){
        door = "открыто";
    }

    public void CloseDoor(){
        door = "закрыто";
    }

    public void OpenOrCloseDoor(){
        if (door=="открыто"){
            System.out.println("Нужно закрыть дверь");
        }
        else System.out.println("Нужно открыть дверь");
    }

    public void OpenWindow(){
        window = "открыто";
    }

    public void CloseWindow(){
        window = "закрыто";
    }

    public void OpenOrCloseWindow(){
        if (window=="открыто"){
            System.out.println("Нужно закрыть окна");
        }
        else System.out.println("Нужно открыть окна");
    }

    public void Show(){
        System.out.println("Дверь - " + door + "\n" + "Окна - " + window);
    }

}
