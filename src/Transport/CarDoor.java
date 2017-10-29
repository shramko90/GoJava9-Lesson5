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
            System.out.println("Нужно закрыть дверь");
        }
        else System.out.println("Нужно открыть дверь");
    }

    public void Show(){
        System.out.println("Дверь - " + door + "\n" + "Окна - " + window);
    }

    public String getWindow() {
        return window;
    }

    public String getDoor() {
        return door;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public void setDoor(String door) {
        this.door = door;
    }
}
