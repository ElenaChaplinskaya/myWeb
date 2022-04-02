package model.BookATour;

import model.Tour.Tour;
import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private List<Tour> tours = new ArrayList<>();


    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public void deleteTour(int i) {
        tours.remove(i);
    }

    public List<Tour> getTours() {
        return tours;
    }

}
