public class Coche {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.adicionpuertas();
        myCar.adicionpuertas();
        System.out.println("El conche tiene " + myCar.numPuertas + " puertas");
    }

}

class Car {
    int numPuertas = 0;

    public void adicionpuertas() {
        this.numPuertas++;
    }
}