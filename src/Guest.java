import java.util.UUID;

public class Guest {
    private final UUID guestID;
    private String nameOfGuest;
    private int guestPhoneNumber;

    public Guest(UUID guestID, String nameOfGuest, int guestPhoneNumber) {
        this.guestID = UUID.randomUUID();
        this.nameOfGuest = nameOfGuest;
        this.guestPhoneNumber = guestPhoneNumber;
    }

    public UUID getGuestID() {
        return guestID;
    }

    public String getNameOfGuest() {
        return nameOfGuest;
    }

    public void setNameOfGuest(String nameOfGuest) {
        this.nameOfGuest = nameOfGuest;
    }

    public int getGuestPhoneNumber() {
        return guestPhoneNumber;
    }

    public void setGuestPhoneNumber(int guestPhoneNumber) {
        this.guestPhoneNumber = guestPhoneNumber;
    }
}
