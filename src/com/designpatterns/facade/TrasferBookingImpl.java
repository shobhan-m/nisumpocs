package com.designpatterns.facade;

public class TrasferBookingImpl implements TrasferBooking{

  @Override
  public void book() {
    System.out.println("Transfer booked successfully");		
  }

}