package Transport;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Car {
    private Date productionDate = new Date(10,8,2016);
    private String engineType = "Электрический";
    private int maxSpeed = 180;
    private int timeSpeedUp100 = 12;
    private int passengersQty= 5;
    private int passengersInside = 4;
    private int currentSpeed = 70;
    private int wheels[] = {1, 2, 3, 4};
    private int doors[] = {1, 2, 3, 4};

    public Car(Date productionDate, String engineType, int maxSpeed, int timeSpeedUp100, int passengersQty, int passengersInside, int currentSpeed, int[] wheels, int[] doors) {
        this.productionDate = productionDate;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.timeSpeedUp100 = timeSpeedUp100;
        this.passengersQty = passengersQty;
        this.passengersInside = passengersInside;
        this.currentSpeed = currentSpeed;
        this.wheels = wheels;
        this.doors = doors;
    }

    public Car() {
        this.productionDate = productionDate;
    }

    public Car(Date productionDate, String engineType, int maxSpeed, int timeSpeedUp100, int passengersQty, int passengersInside, int currentSpeed) {
        this.productionDate = productionDate;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.timeSpeedUp100 = timeSpeedUp100;
        this.passengersQty = passengersQty;
        this.passengersInside = passengersInside;
        this.currentSpeed = currentSpeed;
    }

    public void ChangeCurrentSpeed(int x){
        currentSpeed = x;
        System.out.println("Текущая скорость - " + x);
    }
    public void AddPassenger(){
        passengersInside = passengersInside + 1;
        if (passengersInside > 5){
            System.out.println("Нету мест");
        }
        else System.out.println("Сейчас пассажиров внутри - " + passengersInside);
    }

    public void DelPassenger(){
        passengersInside = passengersInside - 1;
        if (passengersInside < 1){
            System.out.println("В машине нету пассажиров");
        }
        else System.out.println("Сейчас пассажиров внутри - " + passengersInside);
    }

    public void DelAllPassenger(){
        passengersInside = 0;
        System.out.println("Сейчас пассажиров внутри - " + passengersInside);
    }

    public void getWheelByIndex(){
        System.out.println("Введите индекс колеса");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i=0; i<wheels.length; i++) {
            if(b==i) {
                System.out.println("Вы выбрали колесо - " + b);
            }
        }
        if (b>=wheels.length | b<0){
            System.out.println("Неверный индекс, введите от 0 до 3");
            getWheelByIndex();
        }
    }
    public void getDoorByIndex(){
        System.out.println("Введите индекс двери");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i=0; i<wheels.length; i++) {
            if(b==i) {
                System.out.println("Вы выбрали дверь - " + b);
            }
        }
        if (b>=wheels.length | b<0){
            System.out.println("Неверный индекс");
            getDoorByIndex();
        }
    }

    public void dellAllWheels(){
        wheels = new int[]{};
        System.out.println("Все колеса сняты");
    }
    public void addSomeWheels(int x){
        int a = wheels.length;
        int b = a + x;
        System.out.println("Было добавлено колес - " + x);
        System.out.println("Стало колес - " + (x + b));
    }

    public void maxSpeed(float x){// x - самое стертое колесо в машине
        CarWheel carWheel = new CarWheel(x);
        float m = maxSpeed * carWheel.getTireIntegiry();
        if (passengersInside == 0){
            m =0;
            System.out.println("Максимальная скорость будет - " + m + ", так как нету водителя");
        }
        else System.out.println("Максимальная скорость будет - " + m);
    }

}
