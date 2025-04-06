interface Vehicle {
    void start();
    void stop();
}

class interfaceiii implements Vehicle {
    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
