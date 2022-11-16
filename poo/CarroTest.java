package poo;

public class CarroTest {
    public static void main(String[] args) {

        CarroX car = new CarroX();

        car.estaLigado();
        car.ligar();
        car.acelerar();
        System.out.println(car.motor.giros());

        car.desligar();
        car.frear();

        System.out.println(car.estaLigado());



    }
}
