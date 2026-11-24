package valuableassets;

public class Truck extends Vehicle{

    private int cargoTons;

    public Truck(String makeModel, double initialCost, int initialMileage, int cargoTons) {
        super(makeModel, initialCost, initialMileage);
        this.cargoTons = cargoTons;
    }

    public int getCargoTons() {
        return cargoTons;
    }

    public void setCargoTons(int cargoTons) {
        this.cargoTons = cargoTons;
    }
}
