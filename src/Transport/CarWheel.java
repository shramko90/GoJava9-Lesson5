package Transport;

public class CarWheel {
    private float tireIntegiry;

    public CarWheel() {
    }

    public CarWheel(float tireIntegiry) {
        this.tireIntegiry = tireIntegiry;
    }

    public void NewWheel(){
        tireIntegiry = 1;
    }

    public float ClearTheTire(int x){
        tireIntegiry = (1 - tireIntegiry*x/100);
        System.out.println("Состояние шины - " + tireIntegiry);
        return tireIntegiry;
    }

    public float getTireIntegiry() {
        return tireIntegiry;
    }
}
