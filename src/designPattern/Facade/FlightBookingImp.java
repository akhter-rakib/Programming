package designPattern.Facade;

public class FlightBookingImp implements FlightBooking {
    @Override
    public void book() {
        System.out.println("Flight Booked SuccessFully");
    }
}
