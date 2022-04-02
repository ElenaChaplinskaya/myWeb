import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import model.BookATour.Booking;
import model.BookATour.TravelAgency;
import model.Tour.Cruise;
import model.Tour.Shopping;
import model.Tour.Therapy;
import model.Tour.Vacation;
import model.TypeOfFood.Food;
import model.TypeOfTransport.Transport;


public class BookingTest {

    private Booking booking;
    private TravelAgency travelAgency;

    @Before
    public void init() {
        booking = new Booking();
        travelAgency = new TravelAgency();
        travelAgency.addTour(new Vacation(Transport.BUS, Food.BB, 15));
        travelAgency.addTour(new Vacation(Transport.TRAIN, Food.HB, 7));
        travelAgency.addTour(new Shopping(Transport.BUS, Food.RO, 3));
        travelAgency.addTour(new Shopping(Transport.TRAIN, Food.BB, 4));
        travelAgency.addTour(new Therapy(Transport.AIRPLANE, Food.FB, 14));
        travelAgency.addTour(new Therapy(Transport.BUS, Food.HB, 12));
        travelAgency.addTour(new Cruise(Transport.SHIP, Food.FB, 14));
        travelAgency.addTour(new Cruise(Transport.SHIP, Food.HB, 20));
    }

    @Test
    public void ChooseATour() {
        Assert.assertEquals(2, booking.chooseATour(travelAgency.getTours(), "Vacation").size());
    }

    @Test
    public void Sorted() {
        Assert.assertEquals(Transport.AIRPLANE, booking.sortTourByTransport(travelAgency.getTours()).get(0).getTr());
        Assert.assertEquals(Transport.SHIP
                , booking.sortTourByTransport(travelAgency.getTours()).get(travelAgency.getTours().size() - 1).getTr());
    }

    @Test
    public void addTestTour() {
        Assert.assertNotNull(travelAgency.getTours());
        int sizeBefore = travelAgency.getTours().size();
        travelAgency.addTour(new Vacation(Transport.TRAIN, Food.HB, 25));
        Assert.assertEquals(sizeBefore + 1, travelAgency.getTours().size());
    }

    @Test
    public void deleteTestTour() {
        int sizeBefore = travelAgency.getTours().size();
        travelAgency.deleteTour(0);
        Assert.assertEquals(sizeBefore - 1, travelAgency.getTours().size());
    }
}
