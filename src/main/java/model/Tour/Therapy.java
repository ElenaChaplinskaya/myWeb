package model.Tour;

import model.TypeOfFood.Food;
import model.TypeOfTransport.Transport;

public class Therapy extends Tour {
    public Therapy(Transport transport, Food food, int days) {
        super(transport,food,days);
        this.type="Therapy";
    }

    @Override
    public String toString() {
        return "Therapy{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
