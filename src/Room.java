import java.util.UUID;

public class Room {
    private final UUID RoomID;
    private final double pricePerNight;
    RoomStatus status;
    RoomType type;
    int maxCapacity;

    public UUID getRoomID() {
        return RoomID;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Room(UUID roomID, double pricePerNight, RoomStatus status, RoomType type, int maxCapacity) {
        RoomID = roomID;
        this.pricePerNight = pricePerNight;
        this.status = status;
        this.type = type;
        this.maxCapacity = maxCapacity;
    }
}
