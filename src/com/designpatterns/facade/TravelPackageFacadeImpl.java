package com.designpatterns.facade;
public class TravelPackageFacadeImpl implements TravelPackageFacade{

  @Override
  public void book() {

	//TransferBooking  
    TrasferBooking trasferBooking=new TrasferBookingImpl();
    trasferBooking.book();
    
    //HotelBooking
    HotelBooking hotelBooking=new HotelBookingImpl();
    hotelBooking.book();
    
    //FlightBooking
    FlightBooking flightBooking=new FlightBookingImpl();
    flightBooking.book();
    
    System.out.println("**Travel package booked successfully**");
  }

}