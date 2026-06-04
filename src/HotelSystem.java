import java.util.ArrayList;
import java.util.List;

public class HotelSystem {
    List<Room> rooms;
    List<Guest> guests;
    List<Booking> bookings;

    public HotelSystem(List<Room> rooms, List<Guest> guests, List<Booking> bookings) {
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }
}

