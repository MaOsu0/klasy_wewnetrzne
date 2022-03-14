package Lekcja1;

class Car {
    private int fuel;
    private Engine engine;

    public Car() {
        engine = new Engine("Ferrari");
        System.out.println("Utworzono samochód z silnkiem: " + engine.engineType);
    }

    public void go() throws InterruptedException {
        while (fuel > 0) {
            engine.consumeFuel();
            System.out.println("Pozostao " + fuel + " litrów paliwa");
            Thread.sleep(1000);
        }
        System.out.println("Brak paliwa");
    }

    public void refuel(int liters) {
        fuel = fuel + liters;
    }

    private class Engine {
        private String engineType;
        private static final int FUEL_CONSUMPTON = 20;

        Engine(String engineType) {
            this.engineType = engineType;
        }

//        public Engine createCar (String engineType) {
//            return new Engine(engineType);
//        }

        public void consumeFuel() {
            if (fuel >= FUEL_CONSUMPTON) {
                fuel = fuel - Engine.FUEL_CONSUMPTON;
            } else {
                fuel = 0;
            }
        }
    }


}
