package com.designpatterns.facade;

public class FlightBookingImpl implements FlightBooking{

  @Override
  public void book() {

    System.out.println("Flight booked successfully");
  }

}