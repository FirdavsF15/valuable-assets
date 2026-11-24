package valuableassets;

public abstract class Vehicle implements Valuable {

    private String makeModel;
    private double initialCost;
    private int initialMileage;
    private int currentMileage;
    public static final double DEPRECIATION_PER_MILE = .05;

    public Vehicle(String makeModel, double initialCost, int initialMileage) {
        this.makeModel = makeModel;
        this.initialCost = initialCost;
        this.initialMileage = initialMileage;
        this.currentMileage = initialMileage;
    }




}
