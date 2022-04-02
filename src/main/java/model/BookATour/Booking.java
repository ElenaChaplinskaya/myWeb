package model.BookATour;

import model.Tour.Tour;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Booking {

    private List<Tour> tours;

    public  List<Tour> chooseATour(List<Tour> tours, String tour) {
        List<Tour> t = new ArrayList<>();
        Tour temp;
        for (int i = 0; i < tours.size(); i++) {
            temp = tours.get(i);
            if (temp.getType().equals(tour)) {
                t.add(temp);
            }
        }
        return t;
    }

    public List<Tour> sortTourByTransport(List<Tour> tours) {
        Collections.sort(tours, new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                return o1.getTr().compareTo(o2.getTr());
            }
        });
        return tours;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "tours=" + tours +
                '}';
    }

}
