import java.time.LocalDate;

public class Payment {
    private String paymentID;
    private Booking booking;
    private double paidAmount;
    private PaymentMethod method;
    private PaymentStatus status;
    LocalDate timeOfPayment = LocalDate.now();

    public Payment(String paymentID, Booking booking, double paidAmount, PaymentMethod method, PaymentStatus status, LocalDate timeOfPayment) {
        this.paymentID = paymentID;
        this.booking = booking;
        this.paidAmount = paidAmount;
        this.method = method;
        this.status = status;
        this.timeOfPayment = timeOfPayment;
    }

    @Override
    public String toString(){
        return "Payment ID: " + paymentID +
                "\nBooking ID: " + booking.getBookingID() +
                "\nGuest: " + booking.getGuest().getNameOfGuest() +
                "\nTotal Amount paid: GHS" +  paidAmount + " at " + timeOfPayment+
                "\nPayment method: " + method +
                "\nPayment status: " + status;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public LocalDate getTimeOfPayment() {
        return timeOfPayment;
    }

    public void setTimeOfPayment(LocalDate timeOfPayment) {
        this.timeOfPayment = timeOfPayment;
    }
}
