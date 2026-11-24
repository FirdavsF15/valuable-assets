package valuableassets;

import java.util.ArrayList;

public class Portfolio {

    ArrayList<Valuable> valuables = new ArrayList<>();

    public Portfolio() {
        this.valuables = new ArrayList<>();
    }

    public void addValuable(Valuable valuable){
        valuables.add(valuable);
    }

    public double getValue() {
        double totalValue = 0;

        for (Valuable v: this.valuables) {
            totalValue += v.getValue();
        }

        return totalValue;
    }
}
