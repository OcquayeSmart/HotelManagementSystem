import java.util.ArrayList;
import java.util.List;

public class HotelSystem {
    private List<Room> rooms;
    private List<Guest> guests;
    private List<Booking> bookings;
    //new payments list
    private List<Payment> payments;

    public HotelSystem(List<Room> rooms, List<Guest> guests, List<Booking> bookings) {
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.payments = new ArrayList<>();
    }
    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}

