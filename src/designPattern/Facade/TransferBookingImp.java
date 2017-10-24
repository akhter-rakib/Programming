package designPattern.Facade;

public class TransferBookingImp implements TransferBooking {
    @Override
    public void book() {
        System.out.println("Transfer booked Successfully");
    }
}
