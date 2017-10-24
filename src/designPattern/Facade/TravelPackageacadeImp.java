package designPattern.Facade;

public class TravelPackageacadeImp implements TravelPackageacade {
    @Override
    public void book() {
        TransferBooking transferBooking = new TransferBookingImp();
        transferBooking.book();
        FlightBooking flightBooking = new FlightBookingImp();
        flightBooking.book();
        HotelBooking hotelBooking = new HotelBookingImp();
        hotelBooking.book();
        System.out.println("Travel Package book SuccessFully by a single SubSystem");
    }
}
