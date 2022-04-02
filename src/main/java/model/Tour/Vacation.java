package model.Tour;

import model.TypeOfFood.Food;
import model.TypeOfTransport.Transport;

public class Vacation extends Tour {

    public Vacation(Transport transport, Food food, int days) {
        super(transport,food,days);
        this.type="Vacation";
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}