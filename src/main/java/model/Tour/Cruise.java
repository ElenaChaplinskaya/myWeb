package model.Tour;


import model.TypeOfFood.Food;
import model.TypeOfTransport.Transport;

public class Cruise extends Tour {
    public Cruise(Transport transport, Food food, int days) {
        super(transport, food, days);
        this.type = "Cruise";
    }

    @Override
    public String toString() {
        return "Cruise{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}