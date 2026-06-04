import java.time.LocalDate;
import java.util.UUID;

public class Booking {
    private final UUID bookingID;
    Guest guest;
    Room room;
    LocalDate check_In_date;
    LocalDate check_Out_date;
    private double totalAmountPaid;

    public Booking(UUID bookingID, Guest guest, Room room, LocalDate check_In_date, LocalDate check_Out_date, double totalAmountPaid) {
        this.bookingID = UUID.randomUUID();
        this.guest = guest;
        this.room = room;
        this.check_In_date = check_In_date;
        this.check_Out_date = check_Out_date;
        this.totalAmountPaid = totalAmountPaid;
    }

    public UUID getBookingID() {
        return bookingID;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getCheck_In_date() {
        return check_In_date;
    }

    public void setCheck_In_date(LocalDate check_In_date) {
        this.check_In_date = check_In_date;
    }

    public LocalDate getCheck_Out_date() {
        return check_Out_date;
    }

    public void setCheck_Out_date(LocalDate check_Out_date) {
        this.check_Out_date = check_Out_date;
    }

    public double getTotalAmountPaid() {
        return totalAmountPaid;
    }

    public void setTotalAmountPaid(double totalAmountPaid) {
        this.totalAmountPaid = totalAmountPaid;
    }
}
