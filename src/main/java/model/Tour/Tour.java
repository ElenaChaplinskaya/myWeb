package model.Tour;

import model.TypeOfFood.Food;
import model.TypeOfTransport.Transport;


public abstract class Tour {

    Transport transport;
    Food food;
    private int days;
    public String type;

    public Tour() {
    }

    public Tour(Transport transport, Food food, int days) {
        this.transport = transport;
        this.food = food;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Transport getTr() {
        return transport;
    }

    public void setTr(Transport tr) {
        this.transport = transport;
    }

    public Food getFd() {
        return food;
    }

    public void setFd(Food fd) {
        this.food = fd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "model.Tour{" +
                "tr=" + transport +
                ", fd=" + food +
                ", days=" + days +
                ", type='" + type + '\'' +
                '}';
    }
}
