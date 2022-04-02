package model.Tour;

import model.TypeOfFood.Food;
import model.TypeOfTransport.Transport;

public class Shopping extends Tour {

    public Shopping(Transport transport, Food food, int days) {
        super(transport,food,days);
        this.type="Shopping";
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
